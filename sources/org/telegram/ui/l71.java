package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class l71 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.o9 f40073a;
    public final gk f40074b;
    public final org.telegram.ui.Components.voip.h f40075c;
    public final SessionsActivity d;

    public l71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.d = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f40075c = hVar;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f40073a = o9Var;
        addView(o9Var, g7.e6.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        hVar.f33544j = false;
        hVar.f33548n = 1.2f;
        o9Var.setOnClickListener(new x7(this, 2));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, null);
        addView(l80Var, g7.e6.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        l80Var.setGravity(1);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        l80Var.setTextSize(1, 15.0f);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K6, false));
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = string.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            l80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.vz0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            l80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.vz0) null), indexOf3, indexOf4 - 1, 33);
        }
        l80Var.setText(spannableStringBuilder);
        gk gkVar = new gk(this, context, 3);
        this.f40074b = gkVar;
        gkVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        gkVar.setGravity(17);
        gkVar.setTextSize(1, 14.0f);
        gkVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.eq(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        gkVar.setText(spannableStringBuilder3);
        gkVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        gkVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w02, w03, w03));
        gkVar.setOnClickListener(new w21(this, 6));
        addView(gkVar, g7.e6.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        b();
    }

    public static void a(l71 l71Var) {
        SessionsActivity sessionsActivity = l71Var.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
            return;
        }
        s9.d0(sessionsActivity.getParentActivity(), 2, new j71(sessionsActivity));
    }

    public final void b() {
        int i9;
        TLRPC.Document document;
        int i10;
        boolean z10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i9 = ((org.telegram.ui.ActionBar.o2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            i11 = ((org.telegram.ui.ActionBar.o2) sessionsActivity).currentAccount;
            stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        SvgHelper.SvgDrawable svgDrawable = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            svgDrawable = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f22984c7, 0.2f);
        }
        SvgHelper.SvgDrawable svgDrawable2 = svgDrawable;
        if (svgDrawable2 != null) {
            svgDrawable2.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) sessionsActivity).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
            return;
        }
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        org.telegram.ui.Components.o9 o9Var = this.f40073a;
        o9Var.i(forDocument, "130_130", "tgs", svgDrawable2, tL_messages_stickerSet);
        o9Var.getImageReceiver().setAutoRepeat(2);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i9;
        super.onAttachedToWindow();
        b();
        i9 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i9;
        super.onDetachedFromWindow();
        i9 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
    }
}
