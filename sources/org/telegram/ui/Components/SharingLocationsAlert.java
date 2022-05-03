package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ContentPreviewViewer;

public class SharingLocationsAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private ListAdapter adapter;
    private SharingLocationsAlertDelegate delegate;
    private boolean ignoreLayout;
    private RecyclerListView listView;
    private int scrollOffsetY;
    private Drawable shadowDrawable;
    private TextView textView;

    public interface SharingLocationsAlertDelegate {
        void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public SharingLocationsAlert(Context context, SharingLocationsAlertDelegate sharingLocationsAlertDelegate, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.delegate = sharingLocationsAlertDelegate;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || SharingLocationsAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= SharingLocationsAlert.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                SharingLocationsAlert.this.dismiss();
                return true;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !SharingLocationsAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int i3;
                int size = View.MeasureSpec.getSize(i2);
                if (Build.VERSION.SDK_INT >= 21) {
                    size -= AndroidUtilities.statusBarHeight;
                }
                getMeasuredWidth();
                int dp = AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(56.0f) + 1 + (LocationController.getLocationsCount() * AndroidUtilities.dp(54.0f));
                int i4 = size / 5;
                if (dp < i4 * 3) {
                    i3 = AndroidUtilities.dp(8.0f);
                } else {
                    i3 = i4 * 2;
                    if (dp < size) {
                        i3 -= size - dp;
                    }
                }
                if (SharingLocationsAlert.this.listView.getPaddingTop() != i3) {
                    SharingLocationsAlert.this.ignoreLayout = true;
                    SharingLocationsAlert.this.listView.setPadding(0, i3, 0, AndroidUtilities.dp(8.0f));
                    SharingLocationsAlert.this.ignoreLayout = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(dp, size), 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                SharingLocationsAlert.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (!SharingLocationsAlert.this.ignoreLayout) {
                    super.requestLayout();
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                SharingLocationsAlert.this.shadowDrawable.setBounds(0, SharingLocationsAlert.this.scrollOffsetY - ((BottomSheet) SharingLocationsAlert.this).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                SharingLocationsAlert.this.shadowDrawable.draw(canvas);
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, SharingLocationsAlert.this.listView, 0, null, this.resourcesProvider);
            }

            @Override
            public void requestLayout() {
                if (!SharingLocationsAlert.this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setClipToPadding(false);
        this.listView.setEnabled(true);
        this.listView.setGlowColor(getThemedColor("dialogScrollGlow"));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                SharingLocationsAlert.this.updateLayout();
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                SharingLocationsAlert.this.lambda$new$0(view, i2);
            }
        });
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, LayoutHelper.createFrame(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        PickerBottomLayout pickerBottomLayout = new PickerBottomLayout(context, false);
        pickerBottomLayout.setBackgroundColor(getThemedColor("dialogBackground"));
        this.containerView.addView(pickerBottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        pickerBottomLayout.cancelButton.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        pickerBottomLayout.cancelButton.setTextColor(getThemedColor("dialogTextRed"));
        pickerBottomLayout.cancelButton.setText(LocaleController.getString("StopAllLocationSharings", R.string.StopAllLocationSharings));
        pickerBottomLayout.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                SharingLocationsAlert.this.lambda$new$1(view2);
            }
        });
        pickerBottomLayout.doneButtonTextView.setTextColor(getThemedColor("dialogTextBlue2"));
        pickerBottomLayout.doneButtonTextView.setText(LocaleController.getString("Close", R.string.Close).toUpperCase());
        pickerBottomLayout.doneButton.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        pickerBottomLayout.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                SharingLocationsAlert.this.lambda$new$2(view2);
            }
        });
        pickerBottomLayout.doneButtonBadgeTextView.setVisibility(8);
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$new$0(View view, int i) {
        int i2 = i - 1;
        if (i2 >= 0 && i2 < LocationController.getLocationsCount()) {
            this.delegate.didSelectLocation(getLocation(i2));
            dismiss();
        }
    }

    public void lambda$new$1(View view) {
        for (int i = 0; i < 3; i++) {
            LocationController.getInstance(i).removeAllLocationSharings();
        }
        dismiss();
    }

    public void lambda$new$2(View view) {
        dismiss();
    }

    @SuppressLint({"NewApi"})
    public void updateLayout() {
        if (this.listView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.listView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && holder != null && holder.getAdapterPosition() == 0) {
            i = top;
        }
        if (this.scrollOffsetY != i) {
            RecyclerListView recyclerListView2 = this.listView;
            this.scrollOffsetY = i;
            recyclerListView2.setTopGlowOffset(i);
            this.containerView.invalidate();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.liveLocationsChanged) {
            return;
        }
        if (LocationController.getLocationsCount() == 0) {
            dismiss();
        } else {
            this.adapter.notifyDataSetChanged();
        }
    }

    public LocationController.SharingLocationInfo getLocation(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i2).sharingLocationsUI;
            if (i < arrayList.size()) {
                return arrayList.get(i);
            }
            i -= arrayList.size();
        }
        return null;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return LocationController.getLocationsCount() + 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i != 0) {
                frameLayout = new FrameLayout(this, this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + 1, 1073741824));
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), Theme.dividerPaint);
                    }
                };
                frameLayout.setWillNotDraw(false);
                SharingLocationsAlert.this.textView = new TextView(this.context);
                SharingLocationsAlert.this.textView.setTextColor(SharingLocationsAlert.this.getThemedColor("dialogIcon"));
                SharingLocationsAlert.this.textView.setTextSize(1, 14.0f);
                SharingLocationsAlert.this.textView.setGravity(17);
                SharingLocationsAlert.this.textView.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                frameLayout.addView(SharingLocationsAlert.this.textView, LayoutHelper.createFrame(-1, 40.0f));
            } else {
                frameLayout = new SharingLiveLocationCell(this.context, false, 54, ((BottomSheet) SharingLocationsAlert.this).resourcesProvider);
            }
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((SharingLiveLocationCell) viewHolder.itemView).setDialog(SharingLocationsAlert.this.getLocation(i - 1));
            } else if (itemViewType == 1 && SharingLocationsAlert.this.textView != null) {
                SharingLocationsAlert.this.textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount())));
            }
        }
    }
}
