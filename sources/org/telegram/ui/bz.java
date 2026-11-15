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
public abstract class bz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final org.telegram.ui.ActionBar.e2 f45842a;
    public final int f45843b;
    public final int f45844c;
    public final Drawable d;
    public final Drawable f45845e;
    public final org.telegram.ui.Components.h6 f45846f;
    public final org.telegram.ui.Components.h6 h;
    public final Paint f45847n;
    public final Paint f45848r;
    public float f45849s;
    public boolean f45850w;
    public ValueAnimator f45851x;
    public String f45852y;

    public bz(Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, int i10) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f45842a = e2Var;
        this.f45843b = i7;
        this.f45844c = i10;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, false);
        this.f45846f = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.66f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h6Var.setGravity(i11);
        h6Var.setEllipsizeByGradient(true);
        boolean z10 = org.telegram.messenger.hd.f24104a0;
        if (z10) {
            f10 = 56.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        addView(h6Var, c8.ja.d(-1, 20.0f, 55, f10, 10.33f, f11, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.h = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.f29260z6, null);
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h6Var2.setGravity(i12);
        boolean z11 = org.telegram.messenger.hd.f24104a0;
        if (z11) {
            f12 = 56.0f;
        } else {
            f12 = 64.0f;
        }
        if (z11) {
            f13 = 64.0f;
        } else {
            f13 = 56.0f;
        }
        addView(h6Var2, c8.ja.d(-1, 16.0f, 55, f12, 33.33f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231244));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i13 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
        int i14 = org.telegram.ui.ActionBar.j6.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView, i14, null, mode);
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        boolean z12 = org.telegram.messenger.hd.f24104a0;
        int i15 = (z12 ? 3 : 5) | 16;
        if (z12) {
            f14 = 8.0f;
        } else {
            f14 = 4.0f;
        }
        if (z12) {
            f15 = 4.0f;
        } else {
            f15 = 8.0f;
        }
        addView(imageView, c8.ja.d(40, 40.0f, i15, f14, 4.0f, f15, 4.0f));
        Paint paint = new Paint();
        this.f45847n = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
        Paint paint2 = new Paint();
        this.f45848r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.nk, false));
        Drawable mutate = getContext().getResources().getDrawable(2131232206).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131232207).mutate();
        this.f45845e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.f45852y;
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
        tL_inputChatlistDialogFilter.filter_id = this.f45844c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        az azVar = new az(this, 2);
        ConnectionsManager.getInstance(this.f45843b).sendRequest(tL_chatlists_deleteExportedInvite, new v7(29, this, azVar));
        org.telegram.messenger.g0.i3(azVar, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f45842a;
        if (!(e2Var instanceof hz)) {
            return;
        }
        ct ctVar = ((hz) e2Var).f47843a;
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(e2Var, this);
        H.W(ctVar.U0(this, false));
        H.c(2131232321, org.telegram.messenger.hd.M0(2131750472, null), new az(this, 0), false);
        H.c(2131232109, org.telegram.messenger.hd.M0(2131751534, null), new az(this, 1), true);
        if (org.telegram.messenger.hd.f24104a0) {
            H.f37093i = 3;
        }
        H.Z();
    }

    public final void d() {
        if (this.f45852y == null) {
            return;
        }
        org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(getContext(), org.telegram.messenger.hd.M0(2131749170, null), this.f45852y, org.telegram.messenger.hd.M0(2131746506, null), false);
        og0Var.I0();
        og0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11;
        if (this.E == tL_exportedChatlistInvite) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.f45852y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.h6 h6Var = this.f45846f;
        if (isEmpty) {
            h6Var.c(str, z11, true);
        } else {
            h6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(org.telegram.messenger.hd.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z11, true);
        if (this.f45850w != z10) {
            this.f45850w = z10;
            invalidate();
        }
        boolean z12 = tL_exportedChatlistInvite.revoked;
        if ((z12 ? 1.0f : 0.0f) != this.f45849s) {
            ValueAnimator valueAnimator = this.f45851x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f45851x = null;
            }
            float f10 = 0.0f;
            if (z11) {
                float f11 = this.f45849s;
                if (z12) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f45851x = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 10));
                this.f45851x.addListener(new nn(29, this, z12));
                this.f45851x.setInterpolator(org.telegram.ui.Components.er.h);
                this.f45851x.setDuration(350L);
                this.f45851x.start();
                return;
            }
            if (z12) {
                f10 = 1.0f;
            }
            this.f45849s = f10;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int i7;
        super.onDraw(canvas);
        if (org.telegram.messenger.hd.f24104a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f10 = L;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), this.f45847n);
        float f11 = 0.0f;
        if (this.f45849s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * this.f45849s, this.f45848r);
        }
        float f12 = this.f45849s;
        if (f12 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f12) * 255.0f));
            drawable.setBounds(L - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + L, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f13 = this.f45849s;
        if (f13 > 0.0f) {
            Drawable drawable2 = this.f45845e;
            drawable2.setAlpha((int) (f13 * 255.0f));
            drawable2.setBounds(L - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + L, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.f45850w) {
            if (!org.telegram.messenger.hd.f24104a0) {
                f11 = org.telegram.messenger.g0.L(64.0f);
            }
            float f14 = f11;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f14, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.E;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = a8.p0.s(new StringBuilder(), this.E.title, "\n ");
        }
        sb2.append(str);
        sb2.append(org.telegram.messenger.hd.M0(2131749149, null));
        sb2.append(", ");
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.E;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.E.url;
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
            this.f45847n.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
            this.f45848r.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.nk, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
