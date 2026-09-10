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
public abstract class a10 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p2 f30766a;
    public final int f30767b;
    public final int f30768c;
    public final Drawable d;
    public final Drawable e;
    public final org.telegram.ui.Components.o6 f30769f;
    public final org.telegram.ui.Components.o6 h;
    public final Paint f30770n;
    public final Paint f30771r;
    public float f30772s;
    public boolean v;
    public ValueAnimator f30773w;
    public String f30774x;
    public TL_chatlists.TL_exportedChatlistInvite f30775y;

    public a10(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context);
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        this.f30766a = p2Var;
        this.f30767b = i10;
        this.f30768c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, false);
        this.f30769f = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(15.66f));
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        o6Var.setGravity(i12);
        o6Var.setEllipsizeByGradient(true);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        addView(o6Var, w7.a6.d(-1, 20.0f, 55, f7, 10.33f, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.h = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        o6Var2.setGravity(i13);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f11 = 56.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 56.0f;
        }
        addView(o6Var2, w7.a6.d(-1, 16.0f, 55, f11, 33.33f, f12, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 1, -1));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setOnClickListener(new a(this, 25));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        boolean z12 = LocaleController.isRTL;
        int i14 = (z12 ? 3 : 5) | 16;
        if (z12) {
            f13 = 8.0f;
        } else {
            f13 = 4.0f;
        }
        if (z12) {
            f14 = 4.0f;
        } else {
            f14 = 8.0f;
        }
        addView(imageView, w7.a6.d(40, 40.0f, i14, f13, 4.0f, f14, 4.0f));
        Paint paint = new Paint();
        this.f30770n = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        Paint paint2 = new Paint();
        this.f30771r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.wj, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f30774x;
        if (str == null) {
            substring = null;
        } else {
            substring = str.substring(str.lastIndexOf(47) + 1);
        }
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.f30768c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        z00 z00Var = new z00(this, 2);
        ConnectionsManager.getInstance(this.f30767b).sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.th(16, this, z00Var));
        AndroidUtilities.runOnUIThread(z00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f30766a;
        if (!(p2Var instanceof h10)) {
            return;
        }
        bi.y1 y1Var = ((h10) p2Var).f33232a;
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(p2Var, this);
        H.W(y1Var.U0(this, false));
        H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new z00(this, 0), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new z00(this, 1), true);
        if (LocaleController.isRTL) {
            H.f28683i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f30774x == null) {
            return;
        }
        org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.f30774x, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
        ti0Var.m(R.raw.qr_code_logo);
        ti0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11;
        if (this.f30775y == tL_exportedChatlistInvite) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30775y = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f30774x = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.o6 o6Var = this.f30769f;
        if (isEmpty) {
            o6Var.c(str, z11, true);
        } else {
            o6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z11, true);
        if (this.v != z10) {
            this.v = z10;
            invalidate();
        }
        boolean z12 = tL_exportedChatlistInvite.revoked;
        if ((z12 ? 1.0f : 0.0f) != this.f30772s) {
            ValueAnimator valueAnimator = this.f30773w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30773w = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f30772s;
                if (z12) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f30773w = ofFloat;
                ofFloat.addUpdateListener(new d3(this, 13));
                this.f30773w.addListener(new org.telegram.ui.Components.yo(24, this, z12));
                this.f30773w.setInterpolator(org.telegram.ui.Components.wr.h);
                this.f30773w.setDuration(350L);
                this.f30773w.start();
                return;
            }
            if (z12) {
                f7 = 1.0f;
            }
            this.f30772s = f7;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float dp2;
        int i10;
        super.onDraw(canvas);
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f7 = dp;
        canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.f30770n);
        if (this.f30772s > 0.0f) {
            canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.f30772s, this.f30771r);
        }
        float f10 = this.f30772s;
        if (f10 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f10) * 255.0f));
            drawable.setBounds(dp - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f11 = this.f30772s;
        if (f11 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f11 * 255.0f));
            drawable2.setBounds(dp - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.v) {
            if (LocaleController.isRTL) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(dp2, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.f30775y;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = a4.a.s(new StringBuilder(), this.f30775y.title, "\n ");
        }
        sb2.append(str);
        org.telegram.messenger.em.l(R.string.InviteLink, ", ", sb2);
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.f30775y;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.f30775y.url;
        }
        sb2.append(str2);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }
}
