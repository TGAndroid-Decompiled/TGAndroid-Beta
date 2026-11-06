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
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_chatlists;
public abstract class az extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public TL_chatlists.TL_exportedChatlistInvite D;
    public final org.telegram.ui.ActionBar.f2 f44122a;
    public final int f44123b;
    public final int f44124c;
    public final Drawable d;
    public final Drawable f44125e;
    public final org.telegram.ui.Components.j6 f44126f;
    public final org.telegram.ui.Components.j6 h;
    public final Paint f44127n;
    public final Paint f44128r;
    public float f44129s;
    public boolean f44130w;
    public ValueAnimator f44131x;
    public String f44132y;

    public az(Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f44122a = f2Var;
        this.f44123b = i7;
        this.f44124c = i10;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, false);
        this.f44126f = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.66f));
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.G6, null);
        if (org.telegram.messenger.hd.f22878a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j6Var.setGravity(i11);
        j6Var.setEllipsizeByGradient(true);
        boolean z9 = org.telegram.messenger.hd.f22878a0;
        if (z9) {
            f10 = 56.0f;
        } else {
            f10 = 64.0f;
        }
        if (z9) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        addView(j6Var, c8.ha.d(-1, 20.0f, 55, f10, 10.33f, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.h = j6Var2;
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var2, org.telegram.ui.ActionBar.k6.f28259z6, null);
        if (org.telegram.messenger.hd.f22878a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j6Var2.setGravity(i12);
        boolean z10 = org.telegram.messenger.hd.f22878a0;
        if (z10) {
            f12 = 56.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 56.0f;
        }
        addView(j6Var2, c8.ha.d(-1, 16.0f, 55, f12, 33.33f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231244));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i13 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        int i14 = org.telegram.ui.ActionBar.k6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, null, mode);
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        boolean z11 = org.telegram.messenger.hd.f22878a0;
        int i15 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f14 = 8.0f;
        } else {
            f14 = 4.0f;
        }
        if (z11) {
            f15 = 4.0f;
        } else {
            f15 = 8.0f;
        }
        addView(imageView, c8.ha.d(40, 40.0f, i15, f14, 4.0f, f15, 4.0f));
        Paint paint = new Paint();
        this.f44127n = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        Paint paint2 = new Paint();
        this.f44128r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kk, false));
        Drawable mutate = getContext().getResources().getDrawable(2131232205).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131232206).mutate();
        this.f44125e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f44132y;
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
        tL_inputChatlistDialogFilter.filter_id = this.f44124c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        zy zyVar = new zy(this, 2);
        ConnectionsManager.getInstance(this.f44123b).sendRequest(tL_chatlists_deleteExportedInvite, new ld(27, this, zyVar));
        org.telegram.messenger.g0.i3(zyVar, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f44122a;
        if (!(f2Var instanceof gz)) {
            return;
        }
        zs zsVar = ((gz) f2Var).f46159a;
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, this);
        H.W(zsVar.U0(this, false));
        H.c(2131232320, org.telegram.messenger.hd.M0(2131750471, null), new zy(this, 0), false);
        H.c(2131232108, org.telegram.messenger.hd.M0(2131751535, null), new zy(this, 1), true);
        if (org.telegram.messenger.hd.f22878a0) {
            H.f35187i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f44132y == null) {
            return;
        }
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(getContext(), org.telegram.messenger.hd.M0(2131749169, null), this.f44132y, org.telegram.messenger.hd.M0(2131746505, null), false);
        lg0Var.I0();
        lg0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z9) {
        boolean z10;
        if (this.D == tL_exportedChatlistInvite) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f44132y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.j6 j6Var = this.f44126f;
        if (isEmpty) {
            j6Var.c(str, z10, true);
        } else {
            j6Var.c(tL_exportedChatlistInvite.title, z10, true);
        }
        this.h.c(org.telegram.messenger.hd.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z10, true);
        if (this.f44130w != z9) {
            this.f44130w = z9;
            invalidate();
        }
        boolean z11 = tL_exportedChatlistInvite.revoked;
        if ((z11 ? 1.0f : 0.0f) != this.f44129s) {
            ValueAnimator valueAnimator = this.f44131x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44131x = null;
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f44129s;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f44131x = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 10));
                this.f44131x.addListener(new org.telegram.ui.Components.t9(28, this, z11));
                this.f44131x.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f44131x.setDuration(350L);
                this.f44131x.start();
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            this.f44129s = f10;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int i7;
        super.onDraw(canvas);
        if (org.telegram.messenger.hd.f22878a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f10 = L;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), this.f44127n);
        float f11 = 0.0f;
        if (this.f44129s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * this.f44129s, this.f44128r);
        }
        float f12 = this.f44129s;
        if (f12 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f12) * 255.0f));
            drawable.setBounds(L - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + L, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f13 = this.f44129s;
        if (f13 > 0.0f) {
            Drawable drawable2 = this.f44125e;
            drawable2.setAlpha((int) (f13 * 255.0f));
            drawable2.setBounds(L - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + L, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.f44130w) {
            if (!org.telegram.messenger.hd.f22878a0) {
                f11 = org.telegram.messenger.g0.L(64.0f);
            }
            float f14 = f11;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f22878a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f14, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27972k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.D;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = a8.p0.s(new StringBuilder(), this.D.title, "\n ");
        }
        sb2.append(str);
        sb2.append(org.telegram.messenger.hd.M0(2131749148, null));
        sb2.append(", ");
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.D;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.D.url;
        }
        sb2.append(str2);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f44127n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            this.f44128r.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kk, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
