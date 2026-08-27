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

public final class k71 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public final org.telegram.ui.Components.n9 f39644a;

    public final ik f39645b;

    public final org.telegram.ui.Components.voip.h f39646c;
    public final SessionsActivity d;

    public k71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.d = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f39646c = hVar;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f39644a = n9Var;
        addView(n9Var, h7.z5.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        hVar.f33594j = false;
        hVar.f33598n = 1.2f;
        n9Var.setOnClickListener(new y7(this, 2));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        addView(p80Var, h7.z5.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        p80Var.setGravity(1);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        p80Var.setTextSize(1, 15.0f);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf(42);
        int i13 = iIndexOf + 1;
        int iIndexOf2 = string.indexOf(42, i13);
        if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf != iIndexOf2) {
            p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.xz0) null), iIndexOf, iIndexOf2 - 1, 33);
        }
        String string2 = spannableStringBuilder.toString();
        int iIndexOf3 = string2.indexOf(42);
        int i14 = iIndexOf3 + 1;
        int iIndexOf4 = string2.indexOf(42, i14);
        if (iIndexOf3 != -1 && iIndexOf4 != -1 && iIndexOf3 != iIndexOf4) {
            p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(iIndexOf4, iIndexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.xz0) null), iIndexOf3, iIndexOf4 - 1, 33);
        }
        p80Var.setText(spannableStringBuilder);
        ik ikVar = new ik(this, context, 3);
        this.f39645b = ikVar;
        ikVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        ikVar.setGravity(17);
        ikVar.setTextSize(1, 14.0f);
        ikVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.cq(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        ikVar.setText(spannableStringBuilder2);
        ikVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int iDp = AndroidUtilities.dp(24.0f);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        ikVar.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW0, iW1, iW1));
        ikVar.setOnClickListener(new v21(this, 6));
        addView(ikVar, h7.z5.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        b();
    }

    public static void a(k71 k71Var) {
        SessionsActivity sessionsActivity = k71Var.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            t9.e0(sessionsActivity.getParentActivity(), 2, new i71(sessionsActivity));
        }
    }

    public final void b() {
        SessionsActivity sessionsActivity = this.d;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) sessionsActivity).currentAccount).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) sessionsActivity).currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        TLRPC.Document document = (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() <= 6) ? null : tL_messages_stickerSet.documents.get(6);
        SvgHelper.SvgDrawable svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f) : null;
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) sessionsActivity).currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            return;
        }
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        org.telegram.ui.Components.n9 n9Var = this.f39644a;
        n9Var.i(forDocument, "130_130", "tgs", svgThumb, tL_messages_stickerSet);
        n9Var.getImageReceiver().setAutoRepeat(2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) this.d).currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) this.d).currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
    }
}
