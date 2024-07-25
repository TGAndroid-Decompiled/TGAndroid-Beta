package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_channels_reportSponsoredMessage;
import org.telegram.tgnet.TLRPC$TL_channels_sponsoredMessageReportResultAdsHidden;
import org.telegram.tgnet.TLRPC$TL_channels_sponsoredMessageReportResultChooseOption;
import org.telegram.tgnet.TLRPC$TL_channels_sponsoredMessageReportResultReported;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_sponsoredMessageReportOption;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.ReportAdBottomSheet;
public class ReportAdBottomSheet extends BottomSheet {
    private final Paint backgroundPaint;
    private final TLRPC$Chat chat;
    private Listener listener;
    private final MessageObject messageObject;
    private final ViewPagerFixed viewPager;

    public interface Listener {
        void onHidden();

        void onPremiumRequired();

        void onReported();
    }

    public ReportAdBottomSheet(final Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, TLRPC$Chat tLRPC$Chat) {
        super(context, true, resourcesProvider);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.messageObject = messageObject;
        this.chat = tLRPC$Chat;
        paint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            protected boolean canScrollForward(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                ((BottomSheet) ReportAdBottomSheet.this).containerView.invalidate();
            }
        };
        this.viewPager = viewPagerFixed;
        int i = this.backgroundPaddingLeft;
        viewPagerFixed.setPadding(i, 0, i, 0);
        this.containerView.addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return 5;
            }

            @Override
            public int getItemViewType(int i2) {
                return i2 == 0 ? 0 : 1;
            }

            @Override
            public View createView(int i2) {
                return new Page(context);
            }

            @Override
            public void bindView(View view, int i2, int i3) {
                ((Page) view).bind(i3);
            }
        });
        if (messageObject == null) {
            setReportChooseOption(null);
        }
    }

    public ReportAdBottomSheet setReportChooseOption(final TLRPC$TL_channels_sponsoredMessageReportResultChooseOption tLRPC$TL_channels_sponsoredMessageReportResultChooseOption) {
        final View[] viewPages = this.viewPager.getViewPages();
        if (viewPages[0] instanceof Page) {
            ((Page) viewPages[0]).bind(0);
            this.containerView.post(new Runnable() {
                @Override
                public final void run() {
                    ReportAdBottomSheet.lambda$setReportChooseOption$0(viewPages, tLRPC$TL_channels_sponsoredMessageReportResultChooseOption);
                }
            });
        }
        if (viewPages[1] instanceof Page) {
            ((Page) viewPages[1]).bind(1);
        }
        return this;
    }

    public static void lambda$setReportChooseOption$0(View[] viewArr, TLRPC$TL_channels_sponsoredMessageReportResultChooseOption tLRPC$TL_channels_sponsoredMessageReportResultChooseOption) {
        ((Page) viewArr[0]).setOption(tLRPC$TL_channels_sponsoredMessageReportResultChooseOption);
    }

    public ReportAdBottomSheet setListener(Listener listener) {
        this.listener = listener;
        return this;
    }

    @Override
    public void onBackPressed() {
        if (this.viewPager.getCurrentPosition() > 0) {
            ViewPagerFixed viewPagerFixed = this.viewPager;
            viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).atTop();
        }
        return true;
    }

    public void submitOption(final CharSequence charSequence, byte[] bArr) {
        TLRPC$TL_channels_reportSponsoredMessage tLRPC$TL_channels_reportSponsoredMessage = new TLRPC$TL_channels_reportSponsoredMessage();
        tLRPC$TL_channels_reportSponsoredMessage.channel = MessagesController.getInputChannel(this.chat);
        tLRPC$TL_channels_reportSponsoredMessage.random_id = this.messageObject.sponsoredId;
        tLRPC$TL_channels_reportSponsoredMessage.option = bArr;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_reportSponsoredMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ReportAdBottomSheet.this.lambda$submitOption$2(charSequence, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$submitOption$2(final CharSequence charSequence, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ReportAdBottomSheet.this.lambda$submitOption$1(tLObject, charSequence, tLRPC$TL_error);
            }
        });
    }

    public void lambda$submitOption$1(TLObject tLObject, CharSequence charSequence, TLRPC$TL_error tLRPC$TL_error) {
        Listener listener;
        Listener listener2;
        if (tLObject == null) {
            if (tLRPC$TL_error != null) {
                if ("PREMIUM_ACCOUNT_REQUIRED".equals(tLRPC$TL_error.text)) {
                    Listener listener3 = this.listener;
                    if (listener3 != null) {
                        listener3.onPremiumRequired();
                    }
                } else if ("AD_EXPIRED".equals(tLRPC$TL_error.text) && (listener = this.listener) != null) {
                    listener.onReported();
                }
                dismiss();
            }
        } else if (tLObject instanceof TLRPC$TL_channels_sponsoredMessageReportResultChooseOption) {
            TLRPC$TL_channels_sponsoredMessageReportResultChooseOption tLRPC$TL_channels_sponsoredMessageReportResultChooseOption = (TLRPC$TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
            ViewPagerFixed viewPagerFixed = this.viewPager;
            viewPagerFixed.scrollToPosition(viewPagerFixed.currentPosition + 1);
            Page page = (Page) this.viewPager.getViewPages()[1];
            if (page != null) {
                page.setOption(tLRPC$TL_channels_sponsoredMessageReportResultChooseOption);
                if (charSequence != null) {
                    page.setHeaderText(charSequence);
                }
            }
        } else if (tLObject instanceof TLRPC$TL_channels_sponsoredMessageReportResultAdsHidden) {
            MessagesController.getInstance(this.currentAccount).disableAds(false);
            Listener listener4 = this.listener;
            if (listener4 != null) {
                listener4.onHidden();
                dismiss();
            }
        } else if (!(tLObject instanceof TLRPC$TL_channels_sponsoredMessageReportResultReported) || (listener2 = this.listener) == null) {
        } else {
            listener2.onReported();
            dismiss();
        }
    }

    private class ContainerView extends FrameLayout {
        private final AnimatedFloat isActionBar;
        private final Path path;
        private Boolean statusBarOpen;
        private float top;

        public ContainerView(Context context) {
            super(context);
            this.isActionBar = new AnimatedFloat(this, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            View[] viewPages = ReportAdBottomSheet.this.viewPager.getViewPages();
            this.top = 0.0f;
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    this.top += page.top() * Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, 0.0f);
                    if (page.getVisibility() == 0) {
                        page.updateTops();
                    }
                }
            }
            float f = this.isActionBar.set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f);
            int i = AndroidUtilities.statusBarHeight;
            float f2 = i * f;
            this.top = Math.max(i, this.top) - (AndroidUtilities.statusBarHeight * f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) ReportAdBottomSheet.this).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) ReportAdBottomSheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(8.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f);
            canvas.drawRoundRect(rectF, lerp, lerp, ReportAdBottomSheet.this.backgroundPaint);
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
            updateLightStatusBar(f2 > ((float) AndroidUtilities.statusBarHeight) / 2.0f);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.top) {
                ReportAdBottomSheet.this.dismiss();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        private void updateLightStatusBar(boolean z) {
            Boolean bool = this.statusBarOpen;
            if (bool == null || bool.booleanValue() != z) {
                boolean z2 = AndroidUtilities.computePerceivedBrightness(ReportAdBottomSheet.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(ReportAdBottomSheet.this.getThemedColor(Theme.key_actionBarDefault), AndroidUtilities.DARK_STATUS_BAR_OVERLAY)) > 0.721f;
                Boolean valueOf = Boolean.valueOf(z);
                this.statusBarOpen = valueOf;
                if (!valueOf.booleanValue()) {
                    z2 = z3;
                }
                AndroidUtilities.setLightStatusBar(ReportAdBottomSheet.this.getWindow(), z2);
            }
        }
    }

    public class Page extends FrameLayout {
        private final FrameLayout contentView;
        private final BigHeaderCell headerView;
        private final UniversalRecyclerView listView;
        TLRPC$TL_channels_sponsoredMessageReportResultChooseOption option;
        int pageType;

        public Page(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            BigHeaderCell bigHeaderCell = new BigHeaderCell(this, context, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider);
            this.headerView = bigHeaderCell;
            bigHeaderCell.setOnBackClickListener(new Runnable() {
                @Override
                public final void run() {
                    ReportAdBottomSheet.Page.this.lambda$new$0();
                }
            });
            bigHeaderCell.setText(LocaleController.getString("ReportAd", R.string.ReportAd));
            bigHeaderCell.backDrawable.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider));
            bigHeaderCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider));
            addView(bigHeaderCell, LayoutHelper.createFrame(-1, -2, 55));
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) ReportAdBottomSheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ReportAdBottomSheet.Page.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ReportAdBottomSheet.Page.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setClipToPadding(false);
            universalRecyclerView.layoutManager.setReverseLayout(true);
            universalRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener(ReportAdBottomSheet.this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Page.this.contentView.invalidate();
                    ((BottomSheet) ReportAdBottomSheet.this).containerView.invalidate();
                }
            });
            frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void lambda$new$0() {
            if (this.pageType == 0) {
                ReportAdBottomSheet.this.dismiss();
            } else {
                ReportAdBottomSheet.this.onBackPressed();
            }
        }

        public float top() {
            UItem item;
            float paddingTop = this.contentView.getPaddingTop();
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                int position = this.listView.layoutManager.getPosition(childAt);
                if (position >= 0 && position < this.listView.adapter.getItemCount() && (item = this.listView.adapter.getItem(position)) != null && item.viewType == 28) {
                    paddingTop = this.contentView.getPaddingTop() + childAt.getY();
                }
            }
            return paddingTop;
        }

        public void updateTops() {
            float f = -this.headerView.getHeight();
            int i = 0;
            while (true) {
                if (i >= this.listView.getChildCount()) {
                    break;
                }
                View childAt = this.listView.getChildAt(i);
                if (this.listView.adapter.getItem(this.listView.layoutManager.getPosition(childAt)).viewType == 28) {
                    f = this.contentView.getPaddingTop() + childAt.getY();
                    break;
                }
                i++;
            }
            this.headerView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f));
        }

        public void bind(int i) {
            this.pageType = i;
            this.headerView.setCloseImageVisible(i != 0);
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        public void setOption(TLRPC$TL_channels_sponsoredMessageReportResultChooseOption tLRPC$TL_channels_sponsoredMessageReportResultChooseOption) {
            this.option = tLRPC$TL_channels_sponsoredMessageReportResultChooseOption;
            this.listView.adapter.update(false);
        }

        public void setHeaderText(CharSequence charSequence) {
            this.headerView.setText(charSequence);
            this.headerView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
            if (this.headerView.getMeasuredHeight() <= 0) {
                this.headerView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
            }
            UItem asSpace = UItem.asSpace(this.headerView.getMeasuredHeight());
            asSpace.id = -1;
            asSpace.transparent = true;
            arrayList.add(asSpace);
            int measuredHeight = (int) (0 + (this.headerView.getMeasuredHeight() / AndroidUtilities.density));
            if (this.option != null) {
                HeaderCell headerCell = new HeaderCell(getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider);
                headerCell.setText(this.option.title);
                headerCell.setBackgroundColor(ReportAdBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                UItem asCustom = UItem.asCustom(headerCell);
                asCustom.id = -2;
                arrayList.add(asCustom);
                measuredHeight += 40;
                for (int i = 0; i < this.option.options.size(); i++) {
                    UItem uItem = new UItem(30, false);
                    uItem.text = this.option.options.get(i).text;
                    uItem.iconResId = R.drawable.msg_arrowright;
                    uItem.id = i;
                    arrayList.add(uItem);
                    measuredHeight += 50;
                }
                arrayList.get(arrayList.size() - 1).hideDivider = true;
                if (this.pageType == 0) {
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ReportAdBottomSheet.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider)), 0, 0);
                    combinedDrawable.setFullsize(true);
                    frameLayout.setBackground(combinedDrawable);
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setText(AndroidUtilities.replaceLinks(LocaleController.getString("ReportAdLearnMore", R.string.ReportAdLearnMore), ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider));
                    linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, ((BottomSheet) ReportAdBottomSheet.this).resourcesProvider));
                    linksTextView.setGravity(17);
                    frameLayout.addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                    UItem asCustom2 = UItem.asCustom(frameLayout);
                    asCustom2.id = -3;
                    arrayList.add(asCustom2);
                    measuredHeight += 46;
                }
            }
            if (this.listView != null) {
                if (((BottomSheet) ReportAdBottomSheet.this).containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                    this.listView.layoutManager.setReverseLayout(false);
                    return;
                }
                Collections.reverse(arrayList);
                this.listView.layoutManager.setReverseLayout(true);
            }
        }

        public void onClick(UItem uItem, View view, int i, float f, float f2) {
            if (uItem.viewType == 30) {
                TLRPC$TL_channels_sponsoredMessageReportResultChooseOption tLRPC$TL_channels_sponsoredMessageReportResultChooseOption = this.option;
                if (tLRPC$TL_channels_sponsoredMessageReportResultChooseOption == null) {
                    ReportAdBottomSheet.this.submitOption(uItem.text, null);
                    return;
                }
                TLRPC$TL_sponsoredMessageReportOption tLRPC$TL_sponsoredMessageReportOption = tLRPC$TL_channels_sponsoredMessageReportResultChooseOption.options.get(uItem.id);
                if (tLRPC$TL_sponsoredMessageReportOption != null) {
                    ReportAdBottomSheet.this.submitOption(tLRPC$TL_sponsoredMessageReportOption.text, tLRPC$TL_sponsoredMessageReportOption.option);
                }
            }
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public class BigHeaderCell extends FrameLayout {
            public BackDrawable backDrawable;
            private final ImageView btnBack;
            private Runnable onBackClickListener;
            private final TextView textView;

            public BigHeaderCell(Page page, Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                addView(textView);
                ImageView imageView = new ImageView(context);
                this.btnBack = imageView;
                BackDrawable backDrawable = new BackDrawable(false);
                this.backDrawable = backDrawable;
                imageView.setImageDrawable(backDrawable);
                this.backDrawable.setColor(-1);
                addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ReportAdBottomSheet.Page.BigHeaderCell.this.lambda$new$0(view);
                    }
                });
                setCloseImageVisible(true);
                setMinimumHeight(AndroidUtilities.dp(56.0f));
            }

            public void lambda$new$0(View view) {
                Runnable runnable = this.onBackClickListener;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public void setText(CharSequence charSequence) {
                this.textView.setText(charSequence);
            }

            public void setCloseImageVisible(boolean z) {
                this.btnBack.setVisibility(z ? 0 : 8);
                TextView textView = this.textView;
                boolean z2 = LocaleController.isRTL;
                float f = 22.0f;
                float f2 = (z2 || !z) ? 22.0f : 53.0f;
                if (z2 && z) {
                    f = 53.0f;
                }
                textView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, 55, f2, 14.0f, f, 12.0f));
            }

            public void setOnBackClickListener(Runnable runnable) {
                this.onBackClickListener = runnable;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            }
        }
    }
}
