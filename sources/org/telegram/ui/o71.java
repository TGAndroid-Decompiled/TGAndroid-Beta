package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class o71 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.y9 f42114a;
    public final mk f42115b;
    public final org.telegram.ui.Components.voip.h f42116c;
    public int d;
    public int e;
    public final SessionsActivity f42117f;

    public o71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f42117f = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42116c = hVar;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f42114a = y9Var;
        addView(y9Var, org.telegram.ui.Components.gb1.h(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        hVar.f33823j = false;
        hVar.f33827n = 1.2f;
        y9Var.setOnClickListener(new e8(this, 2));
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, null);
        addView(z90Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        z90Var.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(z90Var, i10, null);
        z90Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.J6, null);
        org.telegram.ui.ActionBar.f7.D(z90Var, org.telegram.ui.ActionBar.y6.K6, null);
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int i13 = indexOf + 1;
        int indexOf2 = string.indexOf(42, i13);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            z90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.y11) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i14 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i14);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            z90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.y11) null), indexOf3, indexOf4 - 1, 33);
        }
        z90Var.setText(spannableStringBuilder);
        mk mkVar = new mk(this, context, 3);
        this.f42115b = mkVar;
        mkVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mkVar.setGravity(17);
        mkVar.setTextSize(1, 14.0f);
        mkVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.zq(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        mkVar.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.f7.V(mkVar, org.telegram.ui.ActionBar.y6.Sh, null);
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        mkVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, x03, x03));
        mkVar.setOnClickListener(new t21(this, 6));
        addView(mkVar, org.telegram.ui.Components.gb1.h(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i10;
        TLRPC.Document document;
        int i11;
        boolean z10;
        int i12;
        SessionsActivity sessionsActivity = this.f42117f;
        i10 = ((org.telegram.ui.ActionBar.r2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            i12 = ((org.telegram.ui.ActionBar.r2) sessionsActivity).currentAccount;
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
            svgDrawable = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23338c7, 0.2f);
        }
        SvgHelper.SvgDrawable svgDrawable2 = svgDrawable;
        if (svgDrawable2 != null) {
            svgDrawable2.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            i11 = ((org.telegram.ui.ActionBar.r2) sessionsActivity).currentAccount;
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
        org.telegram.ui.Components.y9 y9Var = this.f42114a;
        y9Var.i(forDocument, "130_130", "tgs", svgDrawable2, tL_messages_stickerSet);
        y9Var.getImageReceiver().setAutoRepeat(2);
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
        i10 = ((org.telegram.ui.ActionBar.r2) this.f42117f).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.r2) this.f42117f).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
            mk mkVar = this.f42115b;
            if (mkVar != null) {
                if (x02 == this.d) {
                    if (x03 != this.e) {
                    }
                }
                this.d = x02;
                this.e = x03;
                int dp = AndroidUtilities.dp(24.0f);
                mkVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, x03, x03));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
