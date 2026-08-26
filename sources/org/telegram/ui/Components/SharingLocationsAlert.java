package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;

public final class SharingLocationsAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public final ListAdapter adapter;
    public final SharingLocationsAlertDelegate delegate;
    public boolean ignoreLayout;
    public final ChatActivity.AnonymousClass34 listView;
    public int scrollOffsetY;
    public final Drawable shadowDrawable;
    public TextView textView;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            return LocationController.getLocationsCount() + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            LocationController.SharingLocationInfo sharingLocationInfo;
            TextView textView;
            int i2 = viewHolder.mItemViewType;
            SharingLocationsAlert sharingLocationsAlert = SharingLocationsAlert.this;
            if (i2 != 0) {
                if (i2 == 1 && (textView = sharingLocationsAlert.textView) != null) {
                    textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                    return;
                }
                return;
            }
            SharingLiveLocationCell sharingLiveLocationCell = (SharingLiveLocationCell) viewHolder.itemView;
            int size = i - 1;
            sharingLocationsAlert.getClass();
            for (int i3 = 0; i3 < 4; i3++) {
                ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i3).sharingLocationsUI;
                if (size < arrayList.size()) {
                    sharingLocationInfo = arrayList.get(size);
                    sharingLiveLocationCell.setDialog(sharingLocationInfo);
                } else {
                    size -= arrayList.size();
                }
            }
            sharingLocationInfo = null;
            sharingLiveLocationCell.setDialog(sharingLocationInfo);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout sharingLiveLocationCell;
            Context context = this.context;
            SharingLocationsAlert sharingLocationsAlert = SharingLocationsAlert.this;
            if (i != 0) {
                sharingLiveLocationCell = new PhotoViewer.AnonymousClass19(context, 17);
                sharingLiveLocationCell.setWillNotDraw(false);
                TextView textView = new TextView(context);
                sharingLocationsAlert.textView = textView;
                textView.setTextColor(sharingLocationsAlert.getThemedColor(Theme.key_dialogIcon));
                sharingLocationsAlert.textView.setTextSize(1, 14.0f);
                sharingLocationsAlert.textView.setGravity(17);
                sharingLocationsAlert.textView.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                sharingLiveLocationCell.addView(sharingLocationsAlert.textView, LayoutHelper.createFrame(40.0f, -1));
            } else {
                sharingLiveLocationCell = new SharingLiveLocationCell(54, context, ((BottomSheet) sharingLocationsAlert).resourcesProvider, false);
            }
            return new RecyclerListView.Holder(sharingLiveLocationCell);
        }
    }

    public interface SharingLocationsAlertDelegate {
        void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo);
    }

    public SharingLocationsAlert(Context context, SharingLocationsAlertDelegate sharingLocationsAlertDelegate, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, false, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.delegate = sharingLocationsAlertDelegate;
        fixNavigationBar();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int i = Theme.key_dialogBackground;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), PorterDuff.Mode.MULTIPLY));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 26);
        this.containerView = anonymousClass60;
        anonymousClass60.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i2, 0, i2, 0);
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 18);
        this.listView = anonymousClass34;
        getContext();
        anonymousClass34.setLayoutManager(new LinearLayoutManager(1, false));
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        anonymousClass34.setAdapter(listAdapter);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        anonymousClass34.setClipToPadding(false);
        anonymousClass34.setEnabled(true);
        anonymousClass34.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        anonymousClass34.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 7));
        anonymousClass34.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 27));
        this.containerView.addView(anonymousClass34, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, LayoutHelper.createFrame(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        PickerBottomLayout pickerBottomLayout = new PickerBottomLayout(context);
        pickerBottomLayout.setBackgroundColor(getThemedColor(i));
        this.containerView.addView(pickerBottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        TextView textView = pickerBottomLayout.cancelButton;
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i3 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final SharingLocationsAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$1$12$1();
                        break;
                    default:
                        this.f$0.lambda$new$2$8$1();
                        break;
                }
            }
        });
        TextView textView2 = pickerBottomLayout.doneButtonTextView;
        textView2.setTextColor(getThemedColor(Theme.key_dialogTextBlue2));
        textView2.setText(LocaleController.getString(R.string.Close).toUpperCase());
        LinearLayout linearLayout = pickerBottomLayout.doneButton;
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i4 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final SharingLocationsAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$1$12$1();
                        break;
                    default:
                        this.f$0.lambda$new$2$8$1();
                        break;
                }
            }
        });
        pickerBottomLayout.doneButtonBadgeTextView.setVisibility(8);
        listAdapter.mObservable.notifyChanged();
    }

    public static void access$300(SharingLocationsAlert sharingLocationsAlert) {
        int childCount = sharingLocationsAlert.listView.getChildCount();
        ChatActivity.AnonymousClass34 anonymousClass34 = sharingLocationsAlert.listView;
        if (childCount <= 0) {
            int paddingTop = anonymousClass34.getPaddingTop();
            sharingLocationsAlert.scrollOffsetY = paddingTop;
            anonymousClass34.setTopGlowOffset(paddingTop);
            sharingLocationsAlert.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && holder != null && holder.getAdapterPosition() == 0) {
            i = top;
        }
        if (sharingLocationsAlert.scrollOffsetY != i) {
            sharingLocationsAlert.scrollOffsetY = i;
            anonymousClass34.setTopGlowOffset(i);
            sharingLocationsAlert.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.liveLocationsChanged;
        if (i == i3) {
            if (LocationController.getLocationsCount() != 0) {
                this.adapter.mObservable.notifyChanged();
            } else {
                super.lambda$showGiftOfferSheet$15();
                NotificationCenter.getGlobalInstance().removeObserver(this, i3);
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    public final void lambda$new$0$3(int i) {
        LocationController.SharingLocationInfo sharingLocationInfo;
        int size = i - 1;
        if (size < 0 || size >= LocationController.getLocationsCount()) {
            return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i2).sharingLocationsUI;
            if (size < arrayList.size()) {
                sharingLocationInfo = arrayList.get(size);
                this.delegate.didSelectLocation(sharingLocationInfo);
                super.lambda$showGiftOfferSheet$15();
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            }
            size -= arrayList.size();
        }
        sharingLocationInfo = null;
        this.delegate.didSelectLocation(sharingLocationInfo);
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    public final void lambda$new$1$12$1() {
        for (int i = 0; i < 4; i++) {
            LocationController.getInstance(i).removeAllLocationSharings();
        }
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    public final void lambda$new$2$8$1() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
