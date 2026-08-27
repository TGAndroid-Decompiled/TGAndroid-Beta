package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_chatlists;

public abstract class j00 extends FrameLayout {

    public final org.telegram.ui.ActionBar.n2 f39198a;

    public final int f39199b;

    public final int f39200c;
    public final Drawable d;

    public final Drawable f39201e;

    public final org.telegram.ui.Components.j6 f39202f;
    public final org.telegram.ui.Components.j6 h;

    public final Paint f39203n;

    public final Paint f39204r;

    public float f39205s;
    public boolean v;

    public ValueAnimator f39206w;

    public String f39207x;

    public TL_chatlists.TL_exportedChatlistInvite f39208y;

    public j00(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context);
        this.f39198a = n2Var;
        this.f39199b = i10;
        this.f39200c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, false);
        this.f39202f = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(15.66f));
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.setEllipsizeByGradient(true);
        boolean z10 = LocaleController.isRTL;
        addView(j6Var, h7.z5.d(-1, 20.0f, 55, z10 ? 56.0f : 64.0f, 10.33f, z10 ? 64.0f : 56.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.h = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
        j6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z11 = LocaleController.isRTL;
        addView(j6Var2, h7.z5.d(-1, 16.0f, 55, z11 ? 56.0f : 64.0f, 33.33f, z11 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        imageView.setOnClickListener(new a(this, 25));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        boolean z12 = LocaleController.isRTL;
        addView(imageView, h7.z5.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 8.0f : 4.0f, 4.0f, z12 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.f39203n = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        Paint paint2 = new Paint();
        this.f39204r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.wj, false));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.f39201e = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String str = this.f39207x;
        String strSubstring = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
        if (strSubstring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.f39200c;
        tL_chatlists_deleteExportedInvite.slug = strSubstring;
        i00 i00Var = new i00(this, 2);
        ConnectionsManager.getInstance(this.f39199b).sendRequest(tL_chatlists_deleteExportedInvite, new gg(25, this, i00Var));
        AndroidUtilities.runOnUIThread(i00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f39198a;
        if (n2Var instanceof q00) {
            hh.f1 f1Var = ((q00) n2Var).f41471a;
            org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(n2Var, this);
            b70VarH.W(f1Var.V0(this, false));
            b70VarH.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new i00(this, 0), false);
            b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new i00(this, 1), true);
            if (LocaleController.isRTL) {
                b70VarH.f26974i = 3;
            }
            b70VarH.Z();
        }
    }

    public final void d() {
        if (this.f39207x == null) {
            return;
        }
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.f39207x, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
        yh0Var.m(R.raw.qr_code_logo);
        yh0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11 = this.f39208y == tL_exportedChatlistInvite;
        this.f39208y = tL_exportedChatlistInvite;
        String strSubstring = tL_exportedChatlistInvite.url;
        this.f39207x = strSubstring;
        if (strSubstring.startsWith("http://")) {
            strSubstring = strSubstring.substring(7);
        }
        if (strSubstring.startsWith("https://")) {
            strSubstring = strSubstring.substring(8);
        }
        boolean zIsEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.j6 j6Var = this.f39202f;
        if (zIsEmpty) {
            j6Var.c(strSubstring, z11, true);
        } else {
            j6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z11, true);
        if (this.v != z10) {
            this.v = z10;
            invalidate();
        }
        boolean z12 = tL_exportedChatlistInvite.revoked;
        if ((z12 ? 1.0f : 0.0f) != this.f39205s) {
            ValueAnimator valueAnimator = this.f39206w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f39206w = null;
            }
            if (!z11) {
                this.f39205s = z12 ? 1.0f : 0.0f;
                invalidate();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39205s, z12 ? 1.0f : 0.0f);
            this.f39206w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 13));
            this.f39206w.addListener(new go(29, this, z12));
            this.f39206w.setInterpolator(org.telegram.ui.Components.er.h);
            this.f39206w.setDuration(350L);
            this.f39206w.start();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
        float f10 = measuredWidth;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.f39203n);
        if (this.f39205s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.f39205s, this.f39204r);
        }
        float f11 = this.f39205s;
        if (f11 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f11) * 255.0f));
            drawable.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f12 = this.f39205s;
        if (f12 > 0.0f) {
            Drawable drawable2 = this.f39201e;
            drawable2.setAlpha((int) (f12 * 255.0f));
            drawable2.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.v) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.f39208y;
        String str = "";
        sb2.append((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : a9.p.p(new StringBuilder(), this.f39208y.title, "\n "));
        org.telegram.messenger.rl.j(R.string.InviteLink, ", ", sb2);
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.f39208y;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str = "\n\n" + this.f39208y.url;
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }
}
