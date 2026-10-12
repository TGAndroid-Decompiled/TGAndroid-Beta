package org.telegram.ui;

import android.content.Context;
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
public final class b91 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.z9 f34465a;
    public final xk f34466b;
    public final org.telegram.ui.Components.voip.h f34467c;
    public final SessionsActivity d;

    public b91(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.d = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f34467c = hVar;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f34465a = z9Var;
        addView(z9Var, w7.a6.a(120.0f, 0.0f, 16.0f, 0.0f, 0.0f, 120, 1));
        hVar.f30199j = false;
        hVar.f30203n = 1.2f;
        z9Var.setOnClickListener(new c8(this, 2));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
        org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, null);
        addView(da0Var, w7.a6.a(-2.0f, 36.0f, 152.0f, 36.0f, 0.0f, -1, 0));
        da0Var.setGravity(1);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        da0Var.setTextSize(1, 15.0f);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
        da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K6, false));
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int i13 = indexOf + 1;
        int indexOf2 = string.indexOf(42, i13);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            da0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.p11) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i14 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i14);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            da0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p61(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.p11) null), indexOf3, indexOf4 - 1, 33);
        }
        da0Var.setText(spannableStringBuilder);
        xk xkVar = new xk(this, context, 3);
        this.f34466b = xkVar;
        xkVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        xkVar.setGravity(17);
        xkVar.setTextSize(1, 14.0f);
        xkVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.br(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        xkVar.setText(spannableStringBuilder3);
        xkVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        xkVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x02, x03, x03));
        xkVar.setOnClickListener(new v41(this, 4));
        addView(xkVar, w7.a6.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 80));
        a();
    }

    public final void a() {
        int i10;
        TLRPC.Document document;
        int i11;
        boolean z10;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i10 = ((org.telegram.ui.ActionBar.m2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            i12 = ((org.telegram.ui.ActionBar.m2) sessionsActivity).currentAccount;
            stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        SvgHelper.SvgDrawable svgDrawable = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            svgDrawable = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f19883c7, 0.2f);
        }
        SvgHelper.SvgDrawable svgDrawable2 = svgDrawable;
        if (svgDrawable2 != null) {
            svgDrawable2.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            i11 = ((org.telegram.ui.ActionBar.m2) sessionsActivity).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
            return;
        }
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        org.telegram.ui.Components.z9 z9Var = this.f34465a;
        z9Var.i(forDocument, "130_130", "tgs", svgDrawable2, tL_messages_stickerSet);
        z9Var.getImageReceiver().setAutoRepeat(2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        a();
        i10 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
    }
}
