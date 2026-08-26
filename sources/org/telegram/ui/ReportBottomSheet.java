package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class ReportBottomSheet extends BottomSheet {
    private static final int PAGE_TYPE_OPTIONS = 0;
    private static final int PAGE_TYPE_SUB_OPTIONS = 1;
    private final Paint backgroundPaint;
    private final long dialogId;
    private final boolean ephemeral;
    private Listener listener;
    private final ArrayList<Integer> messageIds;
    private final boolean sponsored;
    private final byte[] sponsoredId;
    private final boolean stories;
    private final ViewPagerFixed viewPager;

    public class AnonymousClass3 implements Listener {
        final BulletinFactory val$bulletinFactory;
        final boolean[] val$done;
        final Utilities.Callback val$whenDone;

        public AnonymousClass3(boolean[] zArr, Utilities.Callback callback, BulletinFactory bulletinFactory) {
            this.val$done = zArr;
            this.val$whenDone = callback;
            this.val$bulletinFactory = bulletinFactory;
        }

        public static void lambda$onReported$0(BulletinFactory bulletinFactory) {
            if (LaunchActivity.getSafeLastFragment() == null) {
                return;
            }
            if (bulletinFactory == null) {
                bulletinFactory = BulletinFactory.of(LaunchActivity.getSafeLastFragment());
            }
            if (bulletinFactory == null) {
                return;
            }
            bulletinFactory.createSimpleBulletin(R.raw.msg_antispam, LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2)).setDuration(5000).show();
        }

        @Override
        public final void onHidden() {
            Listener.CC.$default$onHidden(this);
        }

        @Override
        public final void onPremiumRequired() {
            Listener.CC.$default$onPremiumRequired(this);
        }

        @Override
        public void onReported() {
            Utilities.Callback callback;
            boolean[] zArr = this.val$done;
            if (!zArr[0] && (callback = this.val$whenDone) != null) {
                zArr[0] = true;
                callback.run(Boolean.TRUE);
            }
            AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this.val$bulletinFactory, 11), 200L);
        }
    }

    public class AnonymousClass4 implements Listener {
        final Context val$context;
        final ChatActivity val$fragment;
        final MessageObject val$message;
        final Theme.ResourcesProvider val$resourceProvider;

        public AnonymousClass4(ChatActivity chatActivity, Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject) {
            this.val$fragment = chatActivity;
            this.val$context = context;
            this.val$resourceProvider = resourcesProvider;
            this.val$message = messageObject;
        }

        public static void lambda$onHidden$2(ChatActivity chatActivity, MessageObject messageObject) {
            BulletinFactory.of(chatActivity).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            chatActivity.removeFromSponsored(messageObject);
            chatActivity.removeMessageWithThanos(messageObject);
        }

        public static void lambda$onReported$1(ChatActivity chatActivity, Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject) {
            BulletinFactory.of(chatActivity).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 1), resourcesProvider)).show();
            chatActivity.removeFromSponsored(messageObject);
            chatActivity.removeMessageWithThanos(messageObject);
        }

        @Override
        public void onHidden() {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda12(this.val$fragment, this.val$message, 1), 200L);
        }

        @Override
        public void onPremiumRequired() {
            this.val$fragment.showDialog(new PremiumFeatureBottomSheet((BaseFragment) this.val$fragment, 3, true));
        }

        @Override
        public void onReported() {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda26(this.val$fragment, this.val$context, this.val$resourceProvider, this.val$message, 1), 200L);
        }
    }

    public class AnonymousClass5 implements Listener {
        final BulletinFactory val$bulletinFactory;
        final Context val$context;
        final Runnable val$done;
        final Theme.ResourcesProvider val$resourceProvider;
        final Runnable val$showPremium;

        public AnonymousClass5(Runnable runnable, BulletinFactory bulletinFactory, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable2) {
            this.val$done = runnable;
            this.val$bulletinFactory = bulletinFactory;
            this.val$context = context;
            this.val$resourceProvider = resourcesProvider;
            this.val$showPremium = runnable2;
        }

        public static void lambda$onHidden$2(Runnable runnable, BulletinFactory bulletinFactory) {
            if (runnable != null) {
                runnable.run();
            }
            bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
        }

        public static void lambda$onReported$1(Runnable runnable, BulletinFactory bulletinFactory, Context context, Theme.ResourcesProvider resourcesProvider) {
            if (runnable != null) {
                runnable.run();
            }
            bulletinFactory.createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 2), resourcesProvider)).show();
        }

        @Override
        public void onHidden() {
            AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(6, this.val$done, this.val$bulletinFactory), 200L);
        }

        @Override
        public void onPremiumRequired() {
            this.val$showPremium.run();
        }

        @Override
        public void onReported() {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda14(this.val$done, this.val$bulletinFactory, this.val$context, this.val$resourceProvider, 1), 200L);
        }
    }

    public class AnonymousClass6 implements Listener {
        final Context val$context;
        final BaseFragment val$fragment;
        final Runnable val$remove;
        final Theme.ResourcesProvider val$resourceProvider;

        public AnonymousClass6(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
            this.val$fragment = baseFragment;
            this.val$context = context;
            this.val$resourceProvider = resourcesProvider;
            this.val$remove = runnable;
        }

        public static void lambda$onHidden$2(BaseFragment baseFragment, Runnable runnable) {
            BulletinFactory.of(baseFragment).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            AndroidUtilities.runOnUIThread(runnable);
        }

        public static void lambda$onReported$1(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
            BulletinFactory.of(baseFragment).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 3), resourcesProvider)).show();
            AndroidUtilities.runOnUIThread(runnable);
        }

        @Override
        public void onHidden() {
            AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(7, this.val$fragment, this.val$remove), 200L);
        }

        @Override
        public void onPremiumRequired() {
            this.val$fragment.showDialog(new PremiumFeatureBottomSheet(this.val$fragment, 3, true));
        }

        @Override
        public void onReported() {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda1(this.val$fragment, this.val$context, this.val$resourceProvider, this.val$remove, 1), 200L);
        }
    }

    public class ContainerView extends FrameLayout {
        private final AnimatedFloat isActionBar;
        private final Path path;
        private Boolean statusBarOpen;
        private float top;

        public ContainerView(Context context) {
            super(context);
            this.isActionBar = new AnimatedFloat(this, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        private void updateLightStatusBar(boolean z) {
            Boolean bool = this.statusBarOpen;
            if (bool == null || bool.booleanValue() != z) {
                boolean z2 = AndroidUtilities.computePerceivedBrightness(ReportBottomSheet.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(ReportBottomSheet.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                this.statusBarOpen = Boolean.valueOf(z);
                if (!z) {
                    z2 = z3;
                }
                AndroidUtilities.setLightStatusBar(ReportBottomSheet.this.getWindow(), z2);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            View[] viewPages = ReportBottomSheet.this.viewPager.getViewPages();
            this.top = 0.0f;
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    this.top = (page.top() * Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, 0.0f)) + this.top;
                    if (page.getVisibility() == 0) {
                        page.updateTops();
                    }
                }
            }
            float f = this.isActionBar.set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f);
            float f2 = AndroidUtilities.statusBarHeight;
            float f3 = f2 * f;
            this.top = Math.max(f2, this.top) - (AndroidUtilities.statusBarHeight * f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) ReportBottomSheet.this).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) ReportBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f);
            canvas.drawRoundRect(rectF, fLerp, fLerp, ReportBottomSheet.this.backgroundPaint);
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
            updateLightStatusBar(f3 > ((float) AndroidUtilities.statusBarHeight) / 2.0f);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.top) {
                return super.dispatchTouchEvent(motionEvent);
            }
            ReportBottomSheet.this.lambda$showGiftOfferSheet$15();
            return true;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    private ReportBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, long j, ArrayList<Integer> arrayList) {
        this(false, context, resourcesProvider, j, z, z2, arrayList, null);
    }

    public static void continueReport(ChatActivity chatActivity, byte[] bArr, String str, ArrayList<Integer> arrayList, Utilities.Callback<Boolean> callback) {
        if (chatActivity == null) {
            return;
        }
        int currentAccount = chatActivity.getCurrentAccount();
        Context context = chatActivity.getContext();
        long dialogId = chatActivity.getDialogId();
        if (context == null) {
            return;
        }
        open(currentAccount, context, dialogId, false, false, arrayList, BulletinFactory.of(chatActivity), chatActivity.getResourceProvider(), bArr, str, callback);
    }

    public static void lambda$open$5(boolean[] zArr, Utilities.Callback callback) {
        if (zArr[0] || callback == null) {
            return;
        }
        zArr[0] = true;
        callback.run(Boolean.FALSE);
    }

    public static void lambda$open$6() {
        BulletinFactory bulletinFactoryOf;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || (bulletinFactoryOf = BulletinFactory.of(safeLastFragment)) == null) {
            return;
        }
        bulletinFactoryOf.createSimpleBulletin(R.raw.msg_antispam, LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2)).setDuration(5000).show();
    }

    public static void lambda$open$7(boolean[] zArr, Utilities.Callback callback) {
        if (!zArr[0] && callback != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(22), 220L);
    }

    public static void lambda$open$8(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, long j, ArrayList arrayList, final boolean[] zArr, final Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC.ReportResult reportResult, TLRPC.TL_error tL_error) {
        boolean z3 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z3 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            boolean z4 = reportResult instanceof TLRPC.TL_reportResultReported;
            final int i = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            ReportBottomSheet.lambda$open$7(zArr, callback);
                            break;
                        default:
                            ReportBottomSheet.lambda$open$5(zArr, callback);
                            break;
                    }
                }
            }, 200L);
            return;
        }
        ReportBottomSheet reportBottomSheet = new ReportBottomSheet(context, resourcesProvider, z, z2, j, arrayList);
        if (z3) {
            reportBottomSheet.setReportChooseOption((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            reportBottomSheet.setReportChooseOption((TLRPC.TL_reportResultAddComment) reportResult);
        }
        reportBottomSheet.setListener(new AnonymousClass3(zArr, callback, bulletinFactory));
        final int i2 = 1;
        reportBottomSheet.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        ReportBottomSheet.lambda$open$7(zArr, callback);
                        break;
                    default:
                        ReportBottomSheet.lambda$open$5(zArr, callback);
                        break;
                }
            }
        });
        reportBottomSheet.show();
    }

    public static void lambda$openSponsored$11(ChatActivity chatActivity, Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject) {
        BulletinFactory.of(chatActivity).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 6), resourcesProvider)).show();
        chatActivity.removeFromSponsored(messageObject);
        chatActivity.removeMessageWithThanos(messageObject);
    }

    public static void lambda$openSponsored$12(ChatActivity chatActivity, int i, MessageObject messageObject) {
        BulletinFactory.of(chatActivity).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
        MessagesController.getInstance(i).disableAds(false);
        chatActivity.removeFromSponsored(messageObject);
        chatActivity.removeMessageWithThanos(messageObject);
    }

    public static void lambda$openSponsored$14(ChatActivity chatActivity, Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject) {
        BulletinFactory.of(chatActivity).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 5), resourcesProvider)).show();
        chatActivity.removeFromSponsored(messageObject);
        chatActivity.removeMessageWithThanos(messageObject);
    }

    public static void lambda$openSponsored$15(Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, ChatActivity chatActivity, MessageObject messageObject, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            if (tL_error == null || !"AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda26(chatActivity, context, resourcesProvider, messageObject, 2), 200L);
            return;
        }
        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda25(tLObject, context, resourcesProvider, j, bArr, chatActivity, messageObject));
        } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda26(chatActivity, context, resourcesProvider, messageObject, 0), 200L);
        } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda405(chatActivity, i, messageObject), 200L);
        }
    }

    public static void lambda$openSponsored$16(TLObject tLObject, Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, Runnable runnable, BulletinFactory bulletinFactory, Runnable runnable2) {
        new ReportBottomSheet(context, resourcesProvider, j, bArr).setReportChooseOption((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject).setListener(new AnonymousClass5(runnable, bulletinFactory, context, resourcesProvider, runnable2)).show();
    }

    public static void lambda$openSponsored$18(Runnable runnable, BulletinFactory bulletinFactory, Context context, Theme.ResourcesProvider resourcesProvider) {
        if (runnable != null) {
            runnable.run();
        }
        bulletinFactory.createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 7), resourcesProvider)).show();
    }

    public static void lambda$openSponsored$19(Runnable runnable, BulletinFactory bulletinFactory, int i) {
        if (runnable != null) {
            runnable.run();
        }
        bulletinFactory.createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
        MessagesController.getInstance(i).disableAds(false);
    }

    public static void lambda$openSponsored$21(Runnable runnable, BulletinFactory bulletinFactory, Context context, Theme.ResourcesProvider resourcesProvider) {
        if (runnable != null) {
            runnable.run();
        }
        bulletinFactory.createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 9), resourcesProvider)).show();
    }

    public static void lambda$openSponsored$22(Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, Runnable runnable, BulletinFactory bulletinFactory, Runnable runnable2, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            if (tL_error == null || !"AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda14(runnable, bulletinFactory, context, resourcesProvider, 2), 200L);
            return;
        }
        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda13(tLObject, context, resourcesProvider, j, bArr, runnable, bulletinFactory, runnable2));
        } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda14(runnable, bulletinFactory, context, resourcesProvider, 0), 200L);
        } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(runnable, bulletinFactory, i, 25), 200L);
        }
    }

    public static void lambda$openSponsored$9(TLObject tLObject, Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, ChatActivity chatActivity, MessageObject messageObject) {
        new ReportBottomSheet(context, resourcesProvider, j, bArr).setReportChooseOption((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject).setListener(new AnonymousClass4(chatActivity, context, resourcesProvider, messageObject)).show();
    }

    public static void lambda$openSponsoredPeer$23(TLObject tLObject, Context context, Theme.ResourcesProvider resourcesProvider, byte[] bArr, BaseFragment baseFragment, Runnable runnable) {
        new ReportBottomSheet(context, resourcesProvider, 0L, bArr).setReportChooseOption((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject).setListener(new AnonymousClass6(baseFragment, context, resourcesProvider, runnable)).show();
    }

    public static void lambda$openSponsoredPeer$25(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        BulletinFactory.of(baseFragment).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 10), resourcesProvider)).show();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$openSponsoredPeer$26(BaseFragment baseFragment, int i, Runnable runnable) {
        BulletinFactory.of(baseFragment).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
        MessagesController.getInstance(i).disableAds(false);
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$openSponsoredPeer$28(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        BulletinFactory.of(baseFragment).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda7(context, 8), resourcesProvider)).show();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$openSponsoredPeer$29(Context context, Theme.ResourcesProvider resourcesProvider, byte[] bArr, BaseFragment baseFragment, Runnable runnable, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            if (tL_error == null || !"AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda1(baseFragment, context, resourcesProvider, runnable, 2), 200L);
            return;
        }
        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda295(tLObject, (Object) context, (Object) resourcesProvider, (Object) bArr, (Object) baseFragment, (Object) runnable, 4));
        } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
            AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda1(baseFragment, context, resourcesProvider, runnable, 0), 200L);
        } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(baseFragment, i, runnable, 26), 200L);
        }
    }

    public static void lambda$setReportChooseOption$0(View[] viewArr, TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        ((Page) viewArr[0]).setOption(tL_channels_sponsoredMessageReportResultChooseOption);
    }

    public static void lambda$setReportChooseOption$1(View[] viewArr, TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        ((Page) viewArr[0]).setOption(tL_reportResultChooseOption);
    }

    public static void lambda$setReportChooseOption$2(View[] viewArr, TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        ((Page) viewArr[0]).setOption(tL_reportResultAddComment);
    }

    public void lambda$submitOption$3(TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        Listener listener;
        Listener listener2;
        if (this.viewPager.getCurrentView() instanceof Page) {
            Page page = (Page) this.viewPager.getCurrentView();
            if (page.button != null) {
                page.button.setLoading(false);
            }
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!this.sponsored && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    ChatActivity.openReportChat(this.dialogId, charSequence.toString(), bArr, str);
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
        if (z || (tLObject instanceof TLRPC.TL_reportResultChooseOption) || (tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            ViewPagerFixed viewPagerFixed = this.viewPager;
            viewPagerFixed.scrollToPosition(viewPagerFixed.currentPosition + 1);
            Page page2 = (Page) this.viewPager.getViewPages()[1];
            if (page2 != null) {
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    page2.setOption((TLRPC.TL_reportResultChooseOption) tLObject);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    page2.setOption((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z) {
                    page2.setOption((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                }
                if (charSequence != null) {
                    page2.setHeaderText(charSequence);
                    return;
                }
                return;
            }
            return;
        }
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
        }
    }

    public void lambda$submitOption$4(CharSequence charSequence, byte[] bArr, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda295(charSequence, str, tLObject, tL_error, this, bArr));
    }

    private static void open(int i, final Context context, final long j, final boolean z, final boolean z2, final ArrayList<Integer> arrayList, final BulletinFactory bulletinFactory, final Theme.ResourcesProvider resourcesProvider, byte[] bArr, String str, final Utilities.Callback<Boolean> callback) {
        Object obj;
        Object obj2;
        if (context == null || arrayList == null) {
            return;
        }
        final boolean[] zArr = {false};
        if (!z) {
            if (z2) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i).getInputPeer(j);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.id = arrayList.get(0).intValue();
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
                    Context context2 = context;
                    ArrayList arrayList2 = arrayList;
                    boolean[] zArr2 = zArr;
                    Utilities.Callback callback2 = callback;
                    BulletinFactory bulletinFactory2 = bulletinFactory;
                    ReportBottomSheet.lambda$open$8(context2, resourcesProvider, z, z2, j, arrayList2, zArr2, callback2, bulletinFactory2, (TLRPC.ReportResult) obj3, (TLRPC.TL_error) obj4);
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
                Context context2 = context;
                ArrayList arrayList2 = arrayList;
                boolean[] zArr2 = zArr;
                Utilities.Callback callback2 = callback;
                BulletinFactory bulletinFactory2 = bulletinFactory;
                ReportBottomSheet.lambda$open$8(context2, resourcesProvider, z, z2, j, arrayList2, zArr2, callback2, bulletinFactory2, (TLRPC.ReportResult) obj3, (TLRPC.TL_error) obj4);
            }
        });
    }

    public static void openChat(int i, Context context, long j) {
        openChat(i, context, null, j);
    }

    public static void openMessage(BaseFragment baseFragment, MessageObject messageObject) {
        if (baseFragment == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Context context = baseFragment.getContext();
        if (context == null) {
            return;
        }
        open(currentAccount, context, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), BulletinFactory.of(baseFragment), baseFragment.getResourceProvider(), new byte[0], null, null);
    }

    public static void openSponsored(ChatActivity chatActivity, MessageObject messageObject, Theme.ResourcesProvider resourcesProvider) {
        if (chatActivity == null) {
            return;
        }
        int currentAccount = chatActivity.getCurrentAccount();
        Context context = chatActivity.getContext();
        long dialogId = chatActivity.getDialogId();
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new LaunchActivity$$ExternalSyntheticLambda117(context, resourcesProvider, dialogId, bArr, chatActivity, messageObject, currentAccount));
    }

    public static void openSponsoredPeer(BaseFragment baseFragment, byte[] bArr, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (baseFragment == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Context context = baseFragment.getContext();
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ArticleViewer$$ExternalSyntheticLambda33(context, resourcesProvider, bArr, baseFragment, runnable, currentAccount));
    }

    public static void openStory(int i, Context context, TL_stories.StoryItem storyItem, BulletinFactory bulletinFactory, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<Boolean> callback) {
        open(i, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), bulletinFactory, resourcesProvider, new byte[0], null, callback);
    }

    private ReportBottomSheet setListener(Listener listener) {
        this.listener = listener;
        return this;
    }

    private ReportBottomSheet setReportChooseOption(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            ((Page) view).bind(0);
            this.containerView.post(new QrActivity$$ExternalSyntheticLambda5(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            ((Page) view2).bind(1);
        }
        return this;
    }

    public void submitOption(CharSequence charSequence, byte[] bArr, String str) {
        TLObject tLObject;
        if (this.sponsored) {
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            tL_messages_reportSponsoredMessage.random_id = this.sponsoredId;
            tL_messages_reportSponsoredMessage.option = bArr;
            tLObject = tL_messages_reportSponsoredMessage;
        } else {
            if (this.stories) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ArrayList<Integer> arrayList = this.messageIds;
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tLObject = tL_stories_report;
            } else if (this.ephemeral) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ArrayList<Integer> arrayList2 = this.messageIds;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_reportMessage.id = this.messageIds.get(0).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tLObject = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report = new TLRPC.TL_messages_report();
                tL_messages_report.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ArrayList<Integer> arrayList3 = this.messageIds;
                if (arrayList3 != null) {
                    tL_messages_report.id.addAll(arrayList3);
                }
                tL_messages_report.message = str != null ? str : "";
                tL_messages_report.option = bArr;
                tLObject = tL_messages_report;
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new LoginActivity$$ExternalSyntheticLambda27(this, charSequence, bArr, str));
    }

    @Override
    public boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).atTop();
        }
        return true;
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.viewPager.getCurrentView() instanceof Page) {
            Page page = (Page) this.viewPager.getCurrentView();
            if (page.editTextCell != null) {
                AndroidUtilities.hideKeyboard(page.editTextCell);
            }
        }
        if (this.viewPager.getCurrentPosition() <= 0) {
            super.lambda$openCrafting$8();
        } else {
            ViewPagerFixed viewPagerFixed = this.viewPager;
            viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() - 1);
        }
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    private ReportBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr) {
        this(true, context, resourcesProvider, j, false, false, null, bArr);
    }

    public static void openChat(int i, Context context, BulletinFactory bulletinFactory, long j) {
        open(i, context, j, false, false, new ArrayList(), bulletinFactory, null, new byte[0], null, null);
    }

    private ReportBottomSheet(boolean z, final Context context, Theme.ResourcesProvider resourcesProvider, long j, boolean z2, boolean z3, ArrayList<Integer> arrayList, byte[] bArr) {
        super(context, true, false, resourcesProvider);
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
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public boolean canScrollForward(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public void onStartTracking() {
                if (getCurrentView() instanceof Page) {
                    Page page = (Page) getCurrentView();
                    if (page.editTextCell != null) {
                        AndroidUtilities.hideKeyboard(page.editTextCell);
                    }
                }
            }

            @Override
            public void onTabAnimationUpdate(boolean z4) {
                super.onTabAnimationUpdate(z4);
                ((BottomSheet) ReportBottomSheet.this).containerView.invalidate();
            }
        };
        this.viewPager = viewPagerFixed;
        int i2 = this.backgroundPaddingLeft;
        viewPagerFixed.setPadding(i2, 0, i2, 0);
        this.containerView.addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void bindView(View view, int i3, int i4) {
                ((Page) view).bind(i4);
            }

            @Override
            public View createView(int i3) {
                return ReportBottomSheet.this.new Page(context);
            }

            @Override
            public int getItemCount() {
                return 5;
            }

            @Override
            public int getItemViewType(int i3) {
                return i3 == 0 ? 0 : 1;
            }
        });
        if (arrayList == null && bArr == null) {
            if (z) {
                setReportChooseOption((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) null);
            } else {
                setReportChooseOption((TLRPC.TL_reportResultChooseOption) null);
            }
        }
    }

    public static void openChat(ChatActivity chatActivity) {
        if (chatActivity == null) {
            return;
        }
        int currentAccount = chatActivity.getCurrentAccount();
        Context context = chatActivity.getContext();
        long dialogId = chatActivity.getDialogId();
        if (context == null) {
            return;
        }
        open(currentAccount, context, dialogId, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public class Page extends FrameLayout {
        private ButtonWithCounterView button;
        private FrameLayout buttonContainer;
        TLRPC.TL_reportResultAddComment commentOption;
        private final FrameLayout contentView;
        private EditTextCell editTextCell;
        private final BigHeaderCell headerView;
        private final UniversalRecyclerView listView;
        TLRPC.TL_reportResultChooseOption option;
        int pageType;
        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption sponsoredOption;

        public class BigHeaderCell extends FrameLayout {
            public BackDrawable backDrawable;
            private final ImageView btnBack;
            private Runnable onBackClickListener;
            private final TextView textView;

            public BigHeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                TextView textView = new TextView(context);
                this.textView = textView;
                AccountFrozenAlert$$ExternalSyntheticOutline1.m(20.0f, 1, textView);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                addView(textView);
                ImageView imageView = new ImageView(context);
                this.btnBack = imageView;
                BackDrawable backDrawable = new BackDrawable(false);
                this.backDrawable = backDrawable;
                imageView.setImageDrawable(backDrawable);
                BackDrawable backDrawable2 = this.backDrawable;
                backDrawable2.color = -1;
                backDrawable2.invalidateSelf();
                addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
                imageView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 24));
                setCloseImageVisible(true);
                setMinimumHeight(AndroidUtilities.dp(56.0f));
            }

            public void lambda$new$0(View view) {
                Runnable runnable = this.onBackClickListener;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public CharSequence getText() {
                return this.textView.getText();
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            }

            public void setCloseImageVisible(boolean z) {
                this.btnBack.setVisibility(z ? 0 : 8);
                TextView textView = this.textView;
                boolean z2 = LocaleController.isRTL;
                textView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, 55, (z2 || !z) ? 22.0f : 53.0f, 14.0f, (z2 && z) ? 53.0f : 22.0f, 12.0f));
            }

            public void setOnBackClickListener(Runnable runnable) {
                this.onBackClickListener = runnable;
            }

            public void setText(CharSequence charSequence) {
                this.textView.setText(charSequence);
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
            bigHeaderCell.setOnBackClickListener(new ReportBottomSheet$Page$$ExternalSyntheticLambda0(this, 1));
            if (ReportBottomSheet.this.sponsored) {
                bigHeaderCell.setText(LocaleController.getString(R.string.ReportAd));
            } else if (ReportBottomSheet.this.stories) {
                bigHeaderCell.setText(LocaleController.getString(R.string.ReportStory));
            } else {
                bigHeaderCell.setText(LocaleController.getString(R.string.Report2));
            }
            BackDrawable backDrawable = bigHeaderCell.backDrawable;
            backDrawable.color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) ReportBottomSheet.this).resourcesProvider);
            backDrawable.invalidateSelf();
            bigHeaderCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) ReportBottomSheet.this).resourcesProvider));
            addView(bigHeaderCell, LayoutHelper.createFrame(-1, -2, 55));
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) ReportBottomSheet.this).currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda6(this, 4), new PhotoViewer$55$$ExternalSyntheticLambda2(this, 21), null, ((BottomSheet) ReportBottomSheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setClipToPadding(false);
            universalRecyclerView.layoutManager.setReverseLayout(true);
            universalRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Page.this.contentView.invalidate();
                    ((BottomSheet) ReportBottomSheet.this).containerView.invalidate();
                }
            });
            frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void lambda$fillItems$2(View view) {
            if (!this.button.isEnabled() || this.button.isLoading()) {
                return;
            }
            this.button.setLoading(true);
            ReportBottomSheet.this.submitOption(this.headerView.getText(), this.commentOption.option, this.editTextCell.getText().toString());
        }

        public void lambda$new$0() {
            if (this.pageType == 0) {
                ReportBottomSheet.this.lambda$showGiftOfferSheet$15();
            } else {
                ReportBottomSheet.this.lambda$openCrafting$8();
            }
        }

        public void lambda$setOption$1() {
            AndroidUtilities.showKeyboard(this.editTextCell.editText);
        }

        public void onClick(UItem uItem, View view, int i, float f, float f2) {
            if (uItem.viewType == 30) {
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = this.sponsoredOption;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                    TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(uItem.id);
                    if (tL_sponsoredMessageReportOption != null) {
                        ReportBottomSheet.this.submitOption(tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = this.option;
                if (tL_reportResultChooseOption != null) {
                    TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(uItem.id);
                    if (tL_messageReportOption != null) {
                        ReportBottomSheet.this.submitOption(tL_messageReportOption.text, tL_messageReportOption.option, null);
                        return;
                    }
                    return;
                }
                TLRPC.TL_reportResultAddComment tL_reportResultAddComment = this.commentOption;
                if (tL_reportResultAddComment == null) {
                    ReportBottomSheet.this.submitOption(uItem.text, null, null);
                    return;
                }
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    ReportBottomSheet.this.submitOption(null, bArr, null);
                }
            }
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public void bind(int i) {
            this.pageType = i;
            this.headerView.setCloseImageVisible(i != 0);
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
            if (this.headerView.getMeasuredHeight() <= 0) {
                this.headerView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
            }
            UItem uItemAsSpace = UItem.asSpace(this.headerView.getMeasuredHeight());
            uItemAsSpace.id = -1;
            uItemAsSpace.transparent = true;
            arrayList.add(uItemAsSpace);
            int measuredHeight = (int) ((this.headerView.getMeasuredHeight() / AndroidUtilities.density) + 0);
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = this.sponsoredOption;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null || this.option != null || this.commentOption != null) {
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || this.option != null) {
                    HeaderCell headerCell = new HeaderCell(getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BottomSheet) ReportBottomSheet.this).resourcesProvider);
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = this.sponsoredOption;
                    if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                        headerCell.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                    } else {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = this.option;
                        if (tL_reportResultChooseOption != null) {
                            headerCell.setText(tL_reportResultChooseOption.title);
                        }
                    }
                    headerCell.setBackgroundColor(ReportBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                    UItem uItemAsCustom = UItem.asCustom(headerCell);
                    uItemAsCustom.id = -2;
                    arrayList.add(uItemAsCustom);
                    measuredHeight += 40;
                }
                int i = measuredHeight;
                if (this.sponsoredOption != null) {
                    for (int i2 = 0; i2 < this.sponsoredOption.options.size(); i2++) {
                        UItem uItem = new UItem(30, false);
                        uItem.text = this.sponsoredOption.options.get(i2).text;
                        uItem.iconResId = R.drawable.msg_arrowright;
                        uItem.id = i2;
                        arrayList.add(uItem);
                        i += 50;
                    }
                } else if (this.option != null) {
                    for (int i3 = 0; i3 < this.option.options.size(); i3++) {
                        UItem uItem2 = new UItem(30, false);
                        uItem2.text = this.option.options.get(i3).text;
                        uItem2.iconResId = R.drawable.msg_arrowright;
                        uItem2.id = i3;
                        arrayList.add(uItem2);
                        i += 50;
                    }
                } else if (this.commentOption != null) {
                    if (this.editTextCell == null) {
                        EditTextCell editTextCell = new EditTextCell(getContext(), "", true, false, 1024, ((BottomSheet) ReportBottomSheet.this).resourcesProvider) {
                            @Override
                            public void onTextChanged(CharSequence charSequence) {
                                if (Page.this.button != null) {
                                    ButtonWithCounterView buttonWithCounterView = Page.this.button;
                                    Page page = Page.this;
                                    buttonWithCounterView.setEnabled(page.commentOption.optional || !TextUtils.isEmpty(page.editTextCell.getText()));
                                }
                            }
                        };
                        this.editTextCell = editTextCell;
                        editTextCell.setShowLimitWhenNear(100);
                    }
                    this.editTextCell.editText.setHint(LocaleController.getString(this.commentOption.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                    UItem uItemAsCustom2 = UItem.asCustom(this.editTextCell);
                    uItemAsCustom2.id = -3;
                    arrayList.add(uItemAsCustom2);
                    if (ReportBottomSheet.this.messageIds != null && !ReportBottomSheet.this.messageIds.isEmpty()) {
                        zzkf.m(ReportBottomSheet.this.messageIds.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo, arrayList);
                    } else if (DialogObject.isUserDialog(ReportBottomSheet.this.dialogId)) {
                        zzkf.m(R.string.Report2CommentInfoUser, arrayList);
                    } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(((BottomSheet) ReportBottomSheet.this).currentAccount).getChat(Long.valueOf(-ReportBottomSheet.this.dialogId)))) {
                        zzkf.m(R.string.Report2CommentInfoChannel, arrayList);
                    } else {
                        zzkf.m(R.string.Report2CommentInfoGroup, arrayList);
                    }
                    if (this.buttonContainer == null) {
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, ((BottomSheet) ReportBottomSheet.this).resourcesProvider);
                        this.button = buttonWithCounterView;
                        buttonWithCounterView.setText(LocaleController.getString(R.string.Report2Send), false);
                        FrameLayout frameLayout = new FrameLayout(getContext());
                        this.buttonContainer = frameLayout;
                        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) ReportBottomSheet.this).resourcesProvider));
                        this.buttonContainer.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                        View view = new View(getContext());
                        view.setBackgroundColor(Theme.getColor(Theme.key_divider, ((BottomSheet) ReportBottomSheet.this).resourcesProvider));
                        this.buttonContainer.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 48));
                    }
                    this.button.setEnabled(this.commentOption.optional || !TextUtils.isEmpty(this.editTextCell.getText()));
                    this.button.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 23));
                    UItem uItemAsCustom3 = UItem.asCustom(this.buttonContainer);
                    uItemAsCustom3.id = -4;
                    arrayList.add(uItemAsCustom3);
                    i += 112;
                }
                measuredHeight = i;
                ((UItem) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList)).hideDivider = true;
                if (ReportBottomSheet.this.sponsored && this.pageType == 0) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ReportBottomSheet.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ((BottomSheet) ReportBottomSheet.this).resourcesProvider)), 0, 0);
                    combinedDrawable.setFullsize(true);
                    frameLayout2.setBackground(combinedDrawable);
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), ((BottomSheet) ReportBottomSheet.this).resourcesProvider));
                    linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, ((BottomSheet) ReportBottomSheet.this).resourcesProvider));
                    linksTextView.setGravity(17);
                    frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                    UItem uItemAsCustom4 = UItem.asCustom(frameLayout2);
                    uItemAsCustom4.id = -3;
                    arrayList.add(uItemAsCustom4);
                    measuredHeight += 46;
                }
            }
            if (this.listView != null) {
                if (((BottomSheet) ReportBottomSheet.this).containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                    this.listView.layoutManager.setReverseLayout(false);
                } else {
                    Collections.reverse(arrayList);
                    this.listView.layoutManager.setReverseLayout(true);
                }
            }
        }

        public void setHeaderText(CharSequence charSequence) {
            this.headerView.setText(charSequence);
            this.headerView.getText();
            this.headerView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        public void setOption(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
            this.sponsoredOption = tL_channels_sponsoredMessageReportResultChooseOption;
            this.option = null;
            this.commentOption = null;
            this.listView.adapter.update(false);
        }

        public float top() {
            UItem item;
            float paddingTop = this.contentView.getPaddingTop();
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                int position = this.listView.layoutManager.getPosition(childAt);
                if (position >= 0 && position < this.listView.adapter.getItemCount() && (item = this.listView.adapter.getItem(position)) != null && item.viewType == 28) {
                    paddingTop = childAt.getY() + this.contentView.getPaddingTop();
                }
            }
            return paddingTop;
        }

        public void updateTops() {
            float paddingTop = -this.headerView.getHeight();
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (this.listView.adapter.getItem(this.listView.layoutManager.getPosition(childAt)).viewType == 28) {
                    paddingTop = this.contentView.getPaddingTop() + childAt.getY();
                    break;
                }
            }
            this.headerView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, paddingTop));
        }

        public void setOption(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
            this.sponsoredOption = null;
            this.option = tL_reportResultChooseOption;
            this.commentOption = null;
            this.listView.adapter.update(false);
        }

        public void setOption(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
            this.sponsoredOption = null;
            this.option = null;
            this.commentOption = tL_reportResultAddComment;
            this.listView.adapter.update(false);
            if (this.editTextCell != null) {
                AndroidUtilities.runOnUIThread(new ReportBottomSheet$Page$$ExternalSyntheticLambda0(this, 0), 120L);
            }
        }
    }

    public static void openChat(BaseFragment baseFragment, long j) {
        if (baseFragment == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Context context = baseFragment.getContext();
        if (context == null) {
            return;
        }
        open(currentAccount, context, j, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    private ReportBottomSheet setReportChooseOption(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            ((Page) view).bind(0);
            this.containerView.post(new QrActivity$$ExternalSyntheticLambda5(23, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            ((Page) view2).bind(1);
        }
        return this;
    }

    public static void openSponsored(int i, Context context, long j, TLRPC.TL_sponsoredMessage tL_sponsoredMessage, BulletinFactory bulletinFactory, Theme.ResourcesProvider resourcesProvider, Runnable runnable, Runnable runnable2) {
        if (context == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = tL_sponsoredMessage.random_id;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_reportSponsoredMessage, new ReportBottomSheet$$ExternalSyntheticLambda9(context, resourcesProvider, j, bArr, runnable2, bulletinFactory, runnable, i));
    }

    private ReportBottomSheet setReportChooseOption(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            ((Page) view).bind(0);
            this.containerView.post(new QrActivity$$ExternalSyntheticLambda5(21, viewPages, tL_reportResultAddComment));
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            ((Page) view2).bind(1);
        }
        return this;
    }

    public interface Listener {
        void onHidden();

        void onPremiumRequired();

        void onReported();

        public abstract class CC {
            public static void $default$onHidden(Listener listener) {
            }

            public static void $default$onPremiumRequired(Listener listener) {
            }

            public static void $default$onReported(Listener listener) {
            }
        }
    }
}
