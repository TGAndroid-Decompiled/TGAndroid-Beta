package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ReportBottomSheet extends BottomSheet {
    public static final int $r8$clinit = 0;
    public final Paint backgroundPaint;
    public final long dialogId;
    public final boolean ephemeral;
    public Listener listener;
    public final ArrayList messageIds;
    public final boolean sponsored;
    public final byte[] sponsoredId;
    public final boolean stories;
    public final PollItemMenu.AnonymousClass3 viewPager;

    public final class ContainerView extends FrameLayout {
        public final AnimatedFloat isActionBar;
        public final Path path;
        public Boolean statusBarOpen;
        public float top;

        public ContainerView(Context context) {
            super(context);
            this.isActionBar = new AnimatedFloat(250L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            UniversalRecyclerView universalRecyclerView;
            UniversalAdapter universalAdapter;
            UItem item;
            ReportBottomSheet reportBottomSheet = ReportBottomSheet.this;
            View[] viewPages = reportBottomSheet.viewPager.getViewPages();
            float f = 0.0f;
            this.top = 0.0f;
            int length = viewPages.length;
            int i = 0;
            while (i < length) {
                View view = viewPages[i];
                if (view != null) {
                    Page page = (Page) view;
                    float fClamp = Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, f);
                    float f2 = this.top;
                    FrameLayout frameLayout = page.contentView;
                    float paddingTop = frameLayout.getPaddingTop();
                    int i2 = 0;
                    while (true) {
                        universalRecyclerView = page.listView;
                        int childCount = universalRecyclerView.getChildCount();
                        universalAdapter = universalRecyclerView.adapter;
                        if (i2 >= childCount) {
                            break;
                        }
                        View childAt = universalRecyclerView.getChildAt(i2);
                        universalRecyclerView.layoutManager.getClass();
                        int viewLayoutPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewLayoutPosition();
                        if (viewLayoutPosition >= 0 && viewLayoutPosition < universalAdapter.items.size() && (item = universalAdapter.getItem(viewLayoutPosition)) != null && item.viewType == 28) {
                            paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                        }
                        i2++;
                    }
                    this.top = (paddingTop * fClamp) + f2;
                    if (page.getVisibility() == 0) {
                        Page.BigHeaderCell bigHeaderCell = page.headerView;
                        float y = -bigHeaderCell.getHeight();
                        for (int i3 = 0; i3 < universalRecyclerView.getChildCount(); i3++) {
                            View childAt2 = universalRecyclerView.getChildAt(i3);
                            universalRecyclerView.layoutManager.getClass();
                            if (universalAdapter.getItem(((RecyclerView.LayoutParams) childAt2.getLayoutParams()).getViewLayoutPosition()).viewType == 28) {
                                y = childAt2.getY() + frameLayout.getPaddingTop();
                                break;
                            }
                        }
                        bigHeaderCell.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, y));
                    }
                }
                i++;
                f = 0.0f;
            }
            float f3 = this.isActionBar.set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
            float f4 = AndroidUtilities.statusBarHeight;
            float f5 = f4 * f3;
            this.top = Math.max(f4, this.top) - (AndroidUtilities.statusBarHeight * f3);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) reportBottomSheet).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) reportBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f3);
            canvas.drawRoundRect(rectF, fLerp, fLerp, reportBottomSheet.backgroundPaint);
            canvas.save();
            Path path = this.path;
            path.rewind();
            path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            boolean z = f5 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
            Boolean bool = this.statusBarOpen;
            if (bool == null || bool.booleanValue() != z) {
                boolean z2 = AndroidUtilities.computePerceivedBrightness(reportBottomSheet.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(reportBottomSheet.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                this.statusBarOpen = Boolean.valueOf(z);
                if (!z) {
                    z2 = z3;
                }
                AndroidUtilities.setLightStatusBar(reportBottomSheet.getWindow(), z2);
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.top) {
                return super.dispatchTouchEvent(motionEvent);
            }
            ReportBottomSheet.this.lambda$showGiftOfferSheet$15();
            return true;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    public interface Listener {
        void onHidden();

        void onPremiumRequired();

        void onReported();
    }

    public final class Page extends FrameLayout {
        public ButtonWithCounterView button;
        public FrameLayout buttonContainer;
        public TLRPC.TL_reportResultAddComment commentOption;
        public final FrameLayout contentView;
        public AnonymousClass2 editTextCell;
        public final BigHeaderCell headerView;
        public final UniversalRecyclerView listView;
        public TLRPC.TL_reportResultChooseOption option;
        public int pageType;
        public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption sponsoredOption;

        public final class BigHeaderCell extends FrameLayout {
            public final BackDrawable backDrawable;
            public final ImageView btnBack;
            public ReportBottomSheet$Page$$ExternalSyntheticLambda0 onBackClickListener;
            public final TextView textView;

            public BigHeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                TextView textView = new TextView(context);
                this.textView = textView;
                zzkh.m(20.0f, textView);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                addView(textView);
                ImageView imageView = new ImageView(context);
                this.btnBack = imageView;
                BackDrawable backDrawable = new BackDrawable(false);
                this.backDrawable = backDrawable;
                imageView.setImageDrawable(backDrawable);
                backDrawable.color = -1;
                backDrawable.invalidateSelf();
                addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
                imageView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 28));
                setCloseImageVisible(true);
                setMinimumHeight(AndroidUtilities.dp(56.0f));
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            }

            public final void setCloseImageVisible(boolean z) {
                this.btnBack.setVisibility(z ? 0 : 8);
                TextView textView = this.textView;
                boolean z2 = LocaleController.isRTL;
                textView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, 55, (z2 || !z) ? 22.0f : 53.0f, 14.0f, (z2 && z) ? 53.0f : 22.0f, 12.0f));
            }
        }

        public Page(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            BigHeaderCell bigHeaderCell = new BigHeaderCell(context, ((BottomSheet) ReportBottomSheet.this).resourcesProvider);
            this.headerView = bigHeaderCell;
            bigHeaderCell.onBackClickListener = new ReportBottomSheet$Page$$ExternalSyntheticLambda0(this, 1);
            TextView textView = bigHeaderCell.textView;
            if (ReportBottomSheet.this.sponsored) {
                textView.setText(LocaleController.getString(R.string.ReportAd));
            } else if (ReportBottomSheet.this.stories) {
                textView.setText(LocaleController.getString(R.string.ReportStory));
            } else {
                textView.setText(LocaleController.getString(R.string.Report2));
            }
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) ReportBottomSheet.this).resourcesProvider);
            BackDrawable backDrawable = bigHeaderCell.backDrawable;
            backDrawable.color = color;
            backDrawable.invalidateSelf();
            bigHeaderCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) ReportBottomSheet.this).resourcesProvider));
            addView(bigHeaderCell, LayoutHelper.createFrame(-1, -2, 55));
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) ReportBottomSheet.this).currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 6), new StoriesViewPager$$ExternalSyntheticLambda0(this, 2), null, ((BottomSheet) ReportBottomSheet.this).resourcesProvider, -1, 1);
            this.listView = universalRecyclerView;
            universalRecyclerView.setClipToPadding(false);
            universalRecyclerView.layoutManager.setReverseLayout(true);
            universalRecyclerView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 6));
            frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1.0f, -1));
        }

        public final void bind(int i) {
            this.pageType = i;
            this.headerView.setCloseImageVisible(i != 0);
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        public final void setOption(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
            this.sponsoredOption = null;
            this.option = null;
            this.commentOption = tL_reportResultAddComment;
            this.listView.adapter.update(false);
            if (this.editTextCell != null) {
                AndroidUtilities.runOnUIThread(new ReportBottomSheet$Page$$ExternalSyntheticLambda0(this, 0), 120L);
            }
        }
    }

    public ReportBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr) {
        this(true, context, resourcesProvider, j, false, false, null, bArr);
    }

    public static void lambda$open$8(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, long j, ArrayList arrayList, final boolean[] zArr, final Utilities.Callback callback, final BulletinFactory bulletinFactory, TLRPC.ReportResult reportResult) {
        boolean z3 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z3 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            boolean z4 = reportResult instanceof TLRPC.TL_reportResultReported;
            final int i = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Utilities.Callback callback2;
                    Utilities.Callback callback3;
                    switch (i) {
                        case 0:
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0] && (callback2 = callback) != null) {
                                zArr2[0] = true;
                                callback2.run(Boolean.TRUE);
                            }
                            AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(25), 220L);
                            break;
                        default:
                            boolean[] zArr3 = zArr;
                            if (!zArr3[0] && (callback3 = callback) != null) {
                                zArr3[0] = true;
                                callback3.run(Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            }, 200L);
            return;
        }
        ReportBottomSheet reportBottomSheet = new ReportBottomSheet(false, context, resourcesProvider, j, z, z2, arrayList, null);
        if (z3) {
            reportBottomSheet.setReportChooseOption((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = reportBottomSheet.viewPager.getViewPages();
            View view = viewPages[0];
            if (view instanceof Page) {
                ((Page) view).bind(0);
                reportBottomSheet.containerView.post(new QrActivity$$ExternalSyntheticLambda17(14, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof Page) {
                ((Page) view2).bind(1);
            }
        }
        reportBottomSheet.listener = new Listener() {
            @Override
            public final void onHidden() {
            }

            @Override
            public final void onPremiumRequired() {
            }

            @Override
            public final void onReported() {
                Utilities.Callback callback2;
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && (callback2 = callback) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new ReportBottomSheet$3$$ExternalSyntheticLambda0(0, bulletinFactory), 200L);
            }
        };
        final int i2 = 1;
        reportBottomSheet.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback callback2;
                Utilities.Callback callback3;
                switch (i2) {
                    case 0:
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0] && (callback2 = callback) != null) {
                            zArr2[0] = true;
                            callback2.run(Boolean.TRUE);
                        }
                        AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(25), 220L);
                        break;
                    default:
                        boolean[] zArr3 = zArr;
                        if (!zArr3[0] && (callback3 = callback) != null) {
                            zArr3[0] = true;
                            callback3.run(Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        reportBottomSheet.show();
    }

    public static void open(int i, final Context context, final long j, final boolean z, final boolean z2, final ArrayList arrayList, final BulletinFactory bulletinFactory, final Theme.ResourcesProvider resourcesProvider, byte[] bArr, String str, final Utilities.Callback callback) {
        Object obj;
        Object obj2;
        if (context != null) {
            final boolean[] zArr = {false};
            if (!z) {
                if (z2) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = MessagesController.getInstance(i).getInputPeer(j);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    obj = tL_reportMessage;
                } else {
                    TLRPC.TL_messages_report tL_messages_report = new TLRPC.TL_messages_report();
                    tL_messages_report.peer = MessagesController.getInstance(i).getInputPeer(j);
                    tL_messages_report.id.addAll(arrayList);
                    tL_messages_report.option = bArr;
                    tL_messages_report.message = TextUtils.isEmpty(str) ? "" : str;
                    obj2 = tL_messages_report;
                }
                ConnectionsManager.getInstance(i).sendRequestTyped(obj, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj3, Object obj4) {
                        ArrayList arrayList2 = arrayList;
                        boolean[] zArr2 = zArr;
                        Utilities.Callback callback2 = callback;
                        BulletinFactory bulletinFactory2 = bulletinFactory;
                        ReportBottomSheet.lambda$open$8(context, resourcesProvider, z, z2, j, arrayList2, zArr2, callback2, bulletinFactory2, (TLRPC.ReportResult) obj3);
                    }
                });
            }
            TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
            tL_stories_report.peer = MessagesController.getInstance(i).getInputPeer(j);
            tL_stories_report.id.addAll(arrayList);
            tL_stories_report.option = bArr;
            tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
            obj2 = tL_stories_report;
            obj = obj2;
            ConnectionsManager.getInstance(i).sendRequestTyped(obj, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj3, Object obj4) {
                    ArrayList arrayList2 = arrayList;
                    boolean[] zArr2 = zArr;
                    Utilities.Callback callback2 = callback;
                    BulletinFactory bulletinFactory2 = bulletinFactory;
                    ReportBottomSheet.lambda$open$8(context, resourcesProvider, z, z2, j, arrayList2, zArr2, callback2, bulletinFactory2, (TLRPC.ReportResult) obj3);
                }
            });
        }
    }

    public static void openChat(long j, BaseFragment baseFragment) {
        int currentAccount = baseFragment.getCurrentAccount();
        Context context = baseFragment.getContext();
        if (context == null) {
            return;
        }
        open(currentAccount, context, j, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void openMessage(ChatActivity chatActivity, MessageObject messageObject) {
        int currentAccount = chatActivity.getCurrentAccount();
        Activity parentActivity = chatActivity.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        open(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), BulletinFactory.of(chatActivity), chatActivity.getResourceProvider(), new byte[0], null, null);
    }

    public static void openSponsored(ChatActivity chatActivity, MessageObject messageObject, Theme.ResourcesProvider resourcesProvider) {
        if (chatActivity == null) {
            return;
        }
        int currentAccount = chatActivity.getCurrentAccount();
        Activity parentActivity = chatActivity.getParentActivity();
        long dialogId = chatActivity.getDialogId();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new LaunchActivity$$ExternalSyntheticLambda147(parentActivity, resourcesProvider, dialogId, bArr, chatActivity, messageObject, currentAccount));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return !((Page) currentView).listView.canScrollVertically(-1);
        }
        return true;
    }

    public final void lambda$submitOption$3(TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        Listener listener;
        Listener listener2;
        ButtonWithCounterView buttonWithCounterView;
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if ((anonymousClass3.getCurrentView() instanceof Page) && (buttonWithCounterView = ((Page) anonymousClass3.getCurrentView()).button) != null) {
            buttonWithCounterView.setLoading(false);
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!this.sponsored && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    String string = charSequence.toString();
                    int i = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        Bundle bundle = new Bundle();
                        long j = this.dialogId;
                        if (DialogObject.isUserDialog(j)) {
                            bundle.putLong("user_id", j);
                        } else {
                            bundle.putLong("chat_id", -j);
                        }
                        bundle.putString("reportTitle", string);
                        bundle.putByteArray("reportOption", bArr);
                        bundle.putString("reportMessage", str);
                        safeLastFragment.presentFragment(new ChatActivity(bundle));
                    }
                } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                    Listener listener3 = this.listener;
                    if (listener3 != null) {
                        listener3.onPremiumRequired();
                    }
                } else if ("AD_EXPIRED".equals(tL_error.text) && (listener = this.listener) != null) {
                    listener.onReported();
                }
                lambda$showGiftOfferSheet$15();
                return;
            }
            return;
        }
        boolean z = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
        if (!z && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                MessagesController.getInstance(this.currentAccount).disableAds(false);
                Listener listener4 = this.listener;
                if (listener4 != null) {
                    listener4.onHidden();
                    lambda$showGiftOfferSheet$15();
                    return;
                }
                return;
            }
            if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (listener2 = this.listener) != null) {
                listener2.onReported();
                lambda$showGiftOfferSheet$15();
                return;
            }
            return;
        }
        anonymousClass3.scrollToPosition$1(anonymousClass3.currentPosition + 1);
        Page page = (Page) anonymousClass3.getViewPages()[1];
        if (page != null) {
            boolean z2 = tLObject instanceof TLRPC.TL_reportResultChooseOption;
            UniversalRecyclerView universalRecyclerView = page.listView;
            if (z2) {
                page.sponsoredOption = null;
                page.option = (TLRPC.TL_reportResultChooseOption) tLObject;
                page.commentOption = null;
                universalRecyclerView.adapter.update(false);
            } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                page.setOption((TLRPC.TL_reportResultAddComment) tLObject);
            } else if (z) {
                page.sponsoredOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                page.option = null;
                page.commentOption = null;
                universalRecyclerView.adapter.update(false);
            }
            if (charSequence != null) {
                Page.BigHeaderCell bigHeaderCell = page.headerView;
                bigHeaderCell.textView.setText(charSequence);
                bigHeaderCell.textView.getText();
                bigHeaderCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                if (universalRecyclerView != null) {
                    universalRecyclerView.adapter.update(true);
                }
            }
        }
    }

    @Override
    public final void lambda$openCrafting$8() {
        Page.AnonymousClass2 anonymousClass2;
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if ((anonymousClass3.getCurrentView() instanceof Page) && (anonymousClass2 = ((Page) anonymousClass3.getCurrentView()).editTextCell) != null) {
            AndroidUtilities.hideKeyboard(anonymousClass2);
        }
        if (anonymousClass3.getCurrentPosition() > 0) {
            anonymousClass3.scrollToPosition$1(anonymousClass3.getCurrentPosition() - 1);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    public final void setReportChooseOption(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            ((Page) view).bind(0);
            this.containerView.post(new QrActivity$$ExternalSyntheticLambda17(13, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            ((Page) view2).bind(1);
        }
    }

    public final void submitOption(CharSequence charSequence, byte[] bArr, String str) {
        TLObject tLObject;
        TLObject tLObject2;
        if (this.sponsored) {
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            tL_messages_reportSponsoredMessage.random_id = this.sponsoredId;
            tL_messages_reportSponsoredMessage.option = bArr;
            tLObject2 = tL_messages_reportSponsoredMessage;
        } else {
            ArrayList arrayList = this.messageIds;
            boolean z = this.stories;
            long j = this.dialogId;
            if (z) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tLObject = tL_stories_report;
            } else if (this.ephemeral) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tLObject = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report = new TLRPC.TL_messages_report();
                tL_messages_report.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
                if (arrayList != null) {
                    tL_messages_report.id.addAll(arrayList);
                }
                tL_messages_report.message = str != null ? str : "";
                tL_messages_report.option = bArr;
                tLObject = tL_messages_report;
            }
            tLObject2 = tLObject;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject2, new LoginActivity$$ExternalSyntheticLambda42(this, charSequence, bArr, str));
    }

    public ReportBottomSheet(boolean z, Context context, Theme.ResourcesProvider resourcesProvider, long j, boolean z2, boolean z3, ArrayList arrayList, byte[] bArr) {
        super(context, resourcesProvider, true, false);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.sponsored = z;
        this.messageIds = arrayList;
        this.stories = z2;
        this.ephemeral = z3;
        this.sponsoredId = bArr;
        this.dialogId = j;
        int i = Theme.key_dialogBackground;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        fixNavigationBar(Theme.getColor(i, resourcesProvider));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new ContainerView(context);
        PollItemMenu.AnonymousClass3 anonymousClass3 = new PollItemMenu.AnonymousClass3(this, context, 3);
        this.viewPager = anonymousClass3;
        int i2 = this.backgroundPaddingLeft;
        anonymousClass3.setPadding(i2, 0, i2, 0);
        this.containerView.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 119));
        anonymousClass3.setAdapter(new PollItemMenu.AnonymousClass4(this, context, 2));
        if (arrayList == null && bArr == null) {
            if (z) {
                setReportChooseOption((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) null);
            } else {
                setReportChooseOption((TLRPC.TL_reportResultChooseOption) null);
            }
        }
    }

    public final void setReportChooseOption(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            ((Page) view).bind(0);
            this.containerView.post(new QrActivity$$ExternalSyntheticLambda17(12, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            ((Page) view2).bind(1);
        }
    }
}
