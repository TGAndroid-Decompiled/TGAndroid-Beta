package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.wo;
import org.telegram.ui.lh0;
public class pa extends FrameLayout implements cs, org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 E;
    public final org.telegram.ui.Components.u8 F;
    public boolean G;
    public Object H;
    public CharSequence I;
    public CharSequence J;
    public int K;
    public boolean L;
    public String M;
    public String N;
    public int O;
    public TLRPC.FileLocation P;
    public final int Q;
    public int R;
    public int S;
    public boolean T;
    public final j6 U;
    public long V;
    public boolean W;
    public final ei.d4 f29822a;
    public boolean f29823a0;
    public final org.telegram.ui.ActionBar.k5 f29824b;
    public boolean f29825b0;
    public final org.telegram.ui.ActionBar.k5 f29826c;
    public final ImageView d;
    public final wo f29827e;
    public final CheckBoxSquare f29828f;
    public final ImageView h;
    public final TextView f29829n;
    public final TextView f29830r;
    public Drawable f29831s;
    public final org.telegram.ui.Components.e5 f29832w;
    public final org.telegram.ui.Components.e5 f29833x;
    public ImageView f29834y;

    public pa(Context context, int i3, int i10, boolean z10) {
        this(i3, i10, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int i3;
        int i10;
        TextView textView = this.f29829n;
        if (textView == null) {
            return;
        }
        if (z11) {
            i3 = org.telegram.ui.ActionBar.k6.f28151ri;
        } else if (z10) {
            i3 = org.telegram.ui.ActionBar.k6.f28133qi;
        } else if (z12 && TextUtils.isEmpty(str)) {
            i3 = org.telegram.ui.ActionBar.k6.Ci;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Zd;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setText(bd.M0(2131754382, null));
                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
                y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.12f, w02), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.12f, i3);
                textView.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(textView, a02, null, L, e6Var);
                textView.setOnClickListener(onClickListener);
            } else {
                textView.setText(str);
                textView.setPadding(0, 0, 0, 0);
                textView.setTranslationX(0.0f);
                textView.setBackground(null);
                textView.setOnClickListener(onClickListener);
            }
        } else {
            textView.setText(str);
            textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i3);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, e6Var);
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z12) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (str == null && !z12) {
            h(0, false);
            return;
        }
        CharSequence text = textView.getText();
        h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28008k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28151ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28133qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zd));
    }

    public final void b(int i3, int i10) {
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        ei.d4 d4Var = this.f29822a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        float f15 = 0.0f;
        if (bd.f21784a0) {
            f10 = 0.0f;
        } else {
            f10 = i3 + 7;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (bd.f21784a0) {
            f11 = i3 + 7;
        } else {
            f11 = 0.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        d4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f29824b.getLayoutParams();
        boolean z10 = bd.f21784a0;
        int i13 = 0;
        CheckBoxSquare checkBoxSquare = this.f29828f;
        if (z10) {
            if (checkBoxSquare != null) {
                i12 = 18;
            } else {
                i12 = 0;
            }
            i11 = i12 + 28;
        } else {
            i11 = i3 + 64 + i10;
        }
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(i11);
        if (bd.f21784a0) {
            f12 = i3 + 64 + i10;
        } else {
            if (checkBoxSquare != null) {
                i13 = 18;
            }
            f12 = i13 + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f12);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f29826c.getLayoutParams();
        float f16 = 28.0f;
        if (bd.f21784a0) {
            f13 = 28.0f;
        } else {
            f13 = i3 + 64 + i10;
        }
        layoutParams3.leftMargin = org.telegram.messenger.g0.L(f13);
        if (bd.f21784a0) {
            f16 = i3 + 64 + i10;
        }
        layoutParams3.rightMargin = org.telegram.messenger.g0.L(f16);
        wo woVar = this.f29827e;
        if (woVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
            if (bd.f21784a0) {
                f14 = 0.0f;
            } else {
                f14 = i3 + 32 + i10;
            }
            layoutParams4.leftMargin = org.telegram.messenger.g0.L(f14);
            if (bd.f21784a0) {
                f15 = i3 + 32 + i10;
            }
            layoutParams4.rightMargin = org.telegram.messenger.g0.L(f15);
        }
    }

    public final void c(boolean z10, boolean z11) {
        int i3 = 0;
        wo woVar = this.f29827e;
        if (woVar != null) {
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f29828f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z10, z11);
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            if (!z10) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f29824b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            k5Var.l("", false);
            this.f29826c.l("", false);
            this.f29822a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && k5Var != null) {
            try {
                charSequence = org.telegram.messenger.i6.m(charSequence, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.I = charSequence;
        this.G = !(obj instanceof String);
        this.H = obj;
        this.T = z10;
        setWillNotDraw(!z10);
        i(0);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23246i4) {
            this.f29824b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.W && view == this.f29822a) {
            cg.r.a(canvas, org.telegram.ui.ActionBar.k6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(lh0 lh0Var, CharSequence charSequence, boolean z10) {
        String M0;
        Object a22;
        boolean z11 = lh0Var.f47340e;
        int i3 = this.Q;
        if (z11) {
            int i10 = lh0Var.f47339c;
            if (i10 <= 0 && lh0Var.f47341f) {
                M0 = bd.M0(2131748047, null);
            } else if (i10 <= 0) {
                M0 = bd.M0(2131748048, null);
            } else {
                M0 = bd.M0(2131748052, null);
            }
        } else {
            boolean z12 = lh0Var.f47338b;
            int i11 = lh0Var.f47339c;
            int i12 = lh0Var.f47337a;
            int i13 = 2131747864;
            boolean z13 = true;
            if (i11 == 3 && i12 != Integer.MAX_VALUE) {
                int currentTime = i12 - ConnectionsManager.getInstance(i3).getCurrentTime();
                if (currentTime <= 0) {
                    if (z12) {
                        M0 = bd.M0(2131747926, null);
                    } else {
                        M0 = bd.M0(2131747864, null);
                    }
                } else if (currentTime < 3600) {
                    M0 = bd.a0("WillUnmuteIn", null, 2131742875, bd.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    M0 = bd.a0("WillUnmuteIn", null, 2131742875, bd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    M0 = bd.a0("WillUnmuteIn", null, 2131742875, bd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    M0 = null;
                }
            } else {
                if (i11 != 0 && i11 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    M0 = bd.M0(2131747926, null);
                } else {
                    if (!z13) {
                        i13 = 2131747909;
                    }
                    M0 = bd.M0(i13, null);
                }
            }
            if (M0 == null) {
                M0 = bd.M0(2131747902, null);
            }
            if (lh0Var.f47341f) {
                M0 = t4.c.q(M0, ", Auto");
            }
        }
        if (org.telegram.messenger.m5.C(lh0Var.d)) {
            TLRPC.EncryptedChat a12 = hp.s1(i3).a1(Integer.valueOf((int) (lh0Var.d & 4294967295L)));
            if (a12 != null && (a22 = hp.s1(i3).a2(Long.valueOf(a12.user_id))) != null) {
                d(a22, charSequence, M0, false);
            }
        } else if (org.telegram.messenger.m5.E(lh0Var.d)) {
            Object a23 = hp.s1(i3).a2(Long.valueOf(lh0Var.d));
            if (a23 != null) {
                d(a23, charSequence, M0, z10);
            }
        } else {
            Object M02 = hp.s1(i3).M0(Long.valueOf(-lh0Var.d));
            if (M02 != null) {
                d(M02, charSequence, M0, z10);
            }
        }
    }

    public final void g(int i3, r31 r31Var, boolean z10) {
        CharSequence M0;
        CharSequence M02;
        long j10 = r31Var.f37638x;
        if (j10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            String n4 = l10.n(a22);
            if (a22 != null) {
                if (!TextUtils.isEmpty(n4)) {
                    M02 = t4.c.f("@", n4);
                } else if (a22.bot) {
                    M02 = bd.M0(2131753156, null);
                } else if (a22.contact) {
                    M02 = bd.M0(2131750793, null);
                } else {
                    M02 = bd.M0(2131750722, null);
                }
                d(a22, null, M02, z10);
                return;
            }
            return;
        }
        TLRPC.Chat M03 = hp.s1(i3).M0(Long.valueOf(-j10));
        if (M03 != null) {
            if (M03.participants_count != 0) {
                if (org.telegram.messenger.t3.V(M03)) {
                    M0 = bd.H(',', "Subscribers", M03.participants_count);
                } else {
                    M0 = bd.H(',', "Members", M03.participants_count);
                }
            } else if (!org.telegram.messenger.t3.t0(M03)) {
                if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                    M0 = bd.M0(2131752329, null);
                } else {
                    M0 = bd.M0(2131748649, null);
                }
            } else if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                M0 = bd.M0(2131752318, null);
            } else {
                M0 = bd.M0(2131748646, null);
            }
            d(M03, null, M0, z10);
        }
    }

    public Object getCurrentObject() {
        return this.H;
    }

    public long getDialogId() {
        return this.V;
    }

    public CharSequence getName() {
        return this.f29824b.getText();
    }

    public final void h(int i3, boolean z10) {
        int i10;
        int i11;
        int i12;
        if (i3 > 0) {
            i3 += org.telegram.messenger.g0.L(6.0f);
        }
        boolean z11 = bd.f21784a0;
        if (z11) {
            i10 = i3;
        } else {
            i10 = 0;
        }
        if (!z11) {
            i11 = i3;
        } else {
            i11 = 0;
        }
        this.f29824b.setPadding(i10, 0, i11, 0);
        if (z10) {
            boolean z12 = bd.f21784a0;
            if (z12) {
                i12 = i3;
            } else {
                i12 = 0;
            }
            if (z12) {
                i3 = 0;
            }
            this.f29826c.setPadding(i12, 0, i3, 0);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.pa.i(int):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f29828f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.f23246i4);
        this.f29833x.a();
        this.f29832w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.f23246i4);
        this.f29833x.b();
        this.f29832w.b();
        this.U.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.T) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f29828f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            wo woVar = this.f29827e;
            if (woVar != null && woVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(woVar.f40035a.f31334q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.k5 k5Var = this.f29824b;
        if (k5Var != null) {
            CharSequence text = k5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f29829n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f29826c;
        if (k5Var2 != null) {
            CharSequence text3 = k5Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text3);
            }
        }
        if (sb2.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f29823a0) {
            f10 = 56.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.T ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        int i3;
        TextView textView = this.f29830r;
        if (textView == null) {
            return;
        }
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    public void setAvatarPadding(int i3) {
        b(i3, 0);
    }

    public void setCallCellStyle(int i3) {
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        int i12;
        float f13;
        float f14;
        float f15;
        this.f29823a0 = true;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29824b;
        k5Var.setTextSize(15);
        boolean z10 = bd.f21784a0;
        int i13 = 3;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i14 = i10 | 48;
        float f16 = 30.0f;
        if (z10) {
            f10 = 30.0f;
        } else {
            f10 = i3 + 66;
        }
        if (z10) {
            f11 = i3 + 66;
        } else {
            f11 = 30.0f;
        }
        k5Var.setLayoutParams(mf.d(-1, 20.0f, i14, f10, 10.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f29826c;
        k5Var2.setTextSize(13);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 30.0f;
        } else {
            f12 = i3 + 66;
        }
        if (z11) {
            f16 = i3 + 66;
        }
        k5Var2.setLayoutParams(mf.d(-1, 20.0f, i15, f12, 32.0f, f16, 0.0f));
        int L = org.telegram.messenger.g0.L(22.0f);
        ei.d4 d4Var = this.f29822a;
        d4Var.setRoundRadius(L);
        boolean z12 = bd.f21784a0;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        float f17 = 0.0f;
        if (z12) {
            f13 = 0.0f;
        } else {
            f13 = i3 + 8;
        }
        if (z12) {
            f14 = i3 + 8;
        } else {
            f14 = 0.0f;
        }
        d4Var.setLayoutParams(mf.d(44, 44.0f, i16, f13, 6.0f, f14, 0.0f));
        wo woVar = this.f29827e;
        if (woVar != null) {
            boolean z13 = bd.f21784a0;
            if (z13) {
                i13 = 5;
            }
            int i17 = i13 | 48;
            if (z13) {
                f15 = 0.0f;
            } else {
                f15 = i3 + 37;
            }
            if (z13) {
                f17 = i3 + 37;
            }
            woVar.setLayoutParams(mf.d(24, 24.0f, i17, f15, 32.0f, f17, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f29828f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f10;
        float f11;
        if (onClickListener == null) {
            ImageView imageView = this.f29834y;
            if (imageView != null) {
                removeView(imageView);
                this.f29834y = null;
                return;
            }
            return;
        }
        if (this.f29834y == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f29834y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            pf.a(this.f29834y);
            this.f29834y.setImageResource(2131231269);
            ImageView imageView3 = this.f29834y;
            int i3 = org.telegram.ui.ActionBar.k6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.e6 e6Var = this.E;
            org.telegram.ui.ActionBar.r6.t(imageView3, i3, e6Var, mode);
            ImageView imageView4 = this.f29834y;
            int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
            int i11 = 5;
            org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 5, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
            ImageView imageView5 = this.f29834y;
            boolean z10 = bd.f21784a0;
            if (z10) {
                i11 = 3;
            }
            int i12 = i11 | 16;
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 14.0f;
            }
            addView(imageView5, mf.d(30, 30.0f, i12, f10, 0.0f, f11, 0.0f));
        }
        this.f29834y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i3) {
        this.K = i3;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f29824b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.M = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.L = z10;
    }

    @Override
    public final void updateColors() {
        try {
            int i3 = this.R;
            int i10 = this.S;
            org.telegram.ui.ActionBar.e6 e6Var = this.E;
            if (!this.f29825b0) {
                this.R = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
                this.S = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wl, e6Var);
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.f29826c;
            if (k5Var != null) {
                int textColor = k5Var.getTextColor();
                if (textColor == i10 && i10 != i3) {
                    k5Var.setTextColor(this.S);
                } else if (textColor == i3) {
                    k5Var.setTextColor(this.R);
                }
            }
            ei.d4 d4Var = this.f29822a;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public pa(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        int i12;
        float f10;
        this.Q = h10.f22829t0;
        this.U = new j6(this);
        this.E = e6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f29830r = textView;
            textView.setGravity(17);
            org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Gi, e6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 14.0f));
            textView.setText(bd.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
            boolean z12 = bd.f21784a0;
            addView(textView, mf.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f)) / org.telegram.messenger.g0.f22607p);
        } else {
            i11 = 0;
        }
        this.R = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        this.S = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wl, e6Var);
        this.F = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ei.d4 d4Var = new ei.d4(3, context, this);
        this.f29822a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z13 = bd.f21784a0;
        addView(d4Var, mf.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i3 + 7, 6.0f, z13 ? i3 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29824b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setGravity((bd.f21784a0 ? 5 : 3) | 48);
        boolean z14 = bd.f21784a0;
        int i13 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i3 + 64;
        }
        float f11 = i12;
        if (z14) {
            f10 = i3 + 64;
        } else {
            f10 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(k5Var, mf.d(-1, 20.0f, i13, f11, 10.0f, f10, 0.0f));
        this.f29832w = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), k5Var);
        this.f29833x = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f29826c = k5Var2;
        k5Var2.setTextSize(15);
        k5Var2.setGravity((bd.f21784a0 ? 5 : 3) | 48);
        boolean z15 = bd.f21784a0;
        addView(k5Var2, mf.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i11 + 28 : i3 + 64, 32.0f, z15 ? i3 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i14 = org.telegram.ui.ActionBar.k6.f28043m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, e6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = bd.f21784a0;
        addView(imageView, mf.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f29828f = checkBoxSquare;
            boolean z17 = bd.f21784a0;
            addView(checkBoxSquare, mf.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            wo woVar = new wo(21, context, e6Var);
            this.f29827e = woVar;
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
            boolean z18 = bd.f21784a0;
            addView(woVar, mf.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i3 + 24, 36.0f, z18 ? i3 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Ci, e6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = bd.f21784a0;
            addView(imageView2, mf.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i3 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i3 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f29829n = textView2;
            pf.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27981ii, e6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = bd.f21784a0;
            addView(textView2, mf.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
