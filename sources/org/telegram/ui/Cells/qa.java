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
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mp;
import org.telegram.ui.th0;
public class qa extends FrameLayout implements fs, org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 E;
    public final org.telegram.ui.Components.b9 F;
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
    public final k6 U;
    public long V;
    public boolean W;
    public final fi.t3 f31672a;
    public boolean f31673a0;
    public final org.telegram.ui.ActionBar.n5 f31674b;
    public boolean f31675b0;
    public final org.telegram.ui.ActionBar.n5 f31676c;
    public final ImageView d;
    public final mp f31677e;
    public final CheckBoxSquare f31678f;
    public final ImageView h;
    public final TextView f31679n;
    public final TextView f31680r;
    public Drawable f31681s;
    public final org.telegram.ui.Components.m5 f31682w;
    public final org.telegram.ui.Components.m5 f31683x;
    public ImageView f31684y;

    public qa(Context context, int i7, int i10, boolean z10) {
        this(i7, i10, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int i7;
        int i10;
        TextView textView = this.f31679n;
        if (textView == null) {
            return;
        }
        if (z11) {
            i7 = org.telegram.ui.ActionBar.n6.f29724ui;
        } else if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.f29704ti;
        } else if (z12 && TextUtils.isEmpty(str)) {
            i7 = org.telegram.ui.ActionBar.n6.Fi;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29386ce;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setText(gd.M0(2131754380, null));
                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
                y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.r1(0.12f, w02), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i7);
                textView.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(textView, a02, null, K, i6Var);
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
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.n6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.12f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(textView, d02, K2, null, i6Var);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29526k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29724ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29704ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29386ce));
    }

    public final void b(int i7, int i10) {
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        fi.t3 t3Var = this.f31672a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t3Var.getLayoutParams();
        float f15 = 0.0f;
        if (gd.f24216a0) {
            f10 = 0.0f;
        } else {
            f10 = i7 + 7;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (gd.f24216a0) {
            f11 = i7 + 7;
        } else {
            f11 = 0.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        t3Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f31674b.getLayoutParams();
        boolean z10 = gd.f24216a0;
        int i13 = 0;
        CheckBoxSquare checkBoxSquare = this.f31678f;
        if (z10) {
            if (checkBoxSquare != null) {
                i12 = 18;
            } else {
                i12 = 0;
            }
            i11 = i12 + 28;
        } else {
            i11 = i7 + 64 + i10;
        }
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(i11);
        if (gd.f24216a0) {
            f12 = i7 + 64 + i10;
        } else {
            if (checkBoxSquare != null) {
                i13 = 18;
            }
            f12 = i13 + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f12);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f31676c.getLayoutParams();
        float f16 = 28.0f;
        if (gd.f24216a0) {
            f13 = 28.0f;
        } else {
            f13 = i7 + 64 + i10;
        }
        layoutParams3.leftMargin = org.telegram.messenger.g0.L(f13);
        if (gd.f24216a0) {
            f16 = i7 + 64 + i10;
        }
        layoutParams3.rightMargin = org.telegram.messenger.g0.L(f16);
        mp mpVar = this.f31677e;
        if (mpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mpVar.getLayoutParams();
            if (gd.f24216a0) {
                f14 = 0.0f;
            } else {
                f14 = i7 + 32 + i10;
            }
            layoutParams4.leftMargin = org.telegram.messenger.g0.L(f14);
            if (gd.f24216a0) {
                f15 = i7 + 32 + i10;
            }
            layoutParams4.rightMargin = org.telegram.messenger.g0.L(f15);
        }
    }

    public final void c(boolean z10, boolean z11) {
        int i7 = 0;
        mp mpVar = this.f31677e;
        if (mpVar != null) {
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f31678f;
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
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f31674b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            n5Var.l("", false);
            this.f31676c.l("", false);
            this.f31672a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && n5Var != null) {
            try {
                charSequence = org.telegram.messenger.j6.m(charSequence, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25145k4) {
            this.f31674b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.W && view == this.f31672a) {
            bg.t.a(canvas, org.telegram.ui.ActionBar.n6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(th0 th0Var, CharSequence charSequence, boolean z10) {
        String M0;
        Object c22;
        boolean z11 = th0Var.f52290e;
        int i7 = this.Q;
        if (z11) {
            int i10 = th0Var.f52289c;
            if (i10 <= 0 && th0Var.f52291f) {
                M0 = gd.M0(2131747847, null);
            } else if (i10 <= 0) {
                M0 = gd.M0(2131747848, null);
            } else {
                M0 = gd.M0(2131747852, null);
            }
        } else {
            boolean z12 = th0Var.f52288b;
            int i11 = th0Var.f52289c;
            int i12 = th0Var.f52287a;
            int i13 = 2131747663;
            boolean z13 = true;
            if (i11 == 3 && i12 != Integer.MAX_VALUE) {
                int currentTime = i12 - ConnectionsManager.getInstance(i7).getCurrentTime();
                if (currentTime <= 0) {
                    if (z12) {
                        M0 = gd.M0(2131747725, null);
                    } else {
                        M0 = gd.M0(2131747663, null);
                    }
                } else if (currentTime < 3600) {
                    M0 = gd.a0("WillUnmuteIn", null, 2131742607, gd.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    M0 = gd.a0("WillUnmuteIn", null, 2131742607, gd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    M0 = gd.a0("WillUnmuteIn", null, 2131742607, gd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    M0 = null;
                }
            } else {
                if (i11 != 0 && i11 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    M0 = gd.M0(2131747725, null);
                } else {
                    if (!z13) {
                        i13 = 2131747708;
                    }
                    M0 = gd.M0(i13, null);
                }
            }
            if (M0 == null) {
                M0 = gd.M0(2131747701, null);
            }
            if (th0Var.f52291f) {
                M0 = p5.c.v(M0, ", Auto");
            }
        }
        if (org.telegram.messenger.n5.C(th0Var.d)) {
            TLRPC.EncryptedChat c12 = org.telegram.messenger.mp.u1(i7).c1(Integer.valueOf((int) (th0Var.d & 4294967295L)));
            if (c12 != null && (c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(c12.user_id))) != null) {
                d(c22, charSequence, M0, false);
            }
        } else if (org.telegram.messenger.n5.E(th0Var.d)) {
            Object c23 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(th0Var.d));
            if (c23 != null) {
                d(c23, charSequence, M0, z10);
            }
        } else {
            Object O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-th0Var.d));
            if (O0 != null) {
                d(O0, charSequence, M0, z10);
            }
        }
    }

    public final void g(int i7, l41 l41Var, boolean z10) {
        CharSequence M0;
        CharSequence M02;
        long j3 = l41Var.f37029y;
        if (j3 > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
            String o4 = o10.o(c22);
            if (c22 != null) {
                if (!TextUtils.isEmpty(o4)) {
                    M02 = p5.c.k("@", o4);
                } else if (c22.bot) {
                    M02 = gd.M0(2131753154, null);
                } else if (c22.contact) {
                    M02 = gd.M0(2131750781, null);
                } else {
                    M02 = gd.M0(2131750708, null);
                }
                d(c22, null, M02, z10);
                return;
            }
            return;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
        if (O0 != null) {
            if (O0.participants_count != 0) {
                if (org.telegram.messenger.v3.V(O0)) {
                    M0 = gd.H(',', "Subscribers", O0.participants_count);
                } else {
                    M0 = gd.H(',', "Members", O0.participants_count);
                }
            } else if (!org.telegram.messenger.v3.t0(O0)) {
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    M0 = gd.M0(2131752318, null);
                } else {
                    M0 = gd.M0(2131748449, null);
                }
            } else if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                M0 = gd.M0(2131752307, null);
            } else {
                M0 = gd.M0(2131748446, null);
            }
            d(O0, null, M0, z10);
        }
    }

    public Object getCurrentObject() {
        return this.H;
    }

    public long getDialogId() {
        return this.V;
    }

    public CharSequence getName() {
        return this.f31674b.getText();
    }

    public final void h(int i7, boolean z10) {
        int i10;
        int i11;
        int i12;
        if (i7 > 0) {
            i7 += org.telegram.messenger.g0.L(6.0f);
        }
        boolean z11 = gd.f24216a0;
        if (z11) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (!z11) {
            i11 = i7;
        } else {
            i11 = 0;
        }
        this.f31674b.setPadding(i10, 0, i11, 0);
        if (z10) {
            boolean z12 = gd.f24216a0;
            if (z12) {
                i12 = i7;
            } else {
                i12 = 0;
            }
            if (z12) {
                i7 = 0;
            }
            this.f31676c.setPadding(i12, 0, i7, 0);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.qa.i(int):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f31678f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.f25145k4);
        this.f31683x.a();
        this.f31682w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.f25145k4);
        this.f31683x.b();
        this.f31682w.b();
        this.U.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (gd.f24216a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24216a0) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f31678f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            mp mpVar = this.f31677e;
            if (mpVar != null && mpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(mpVar.f37598a.f32838q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.n5 n5Var = this.f31674b;
        if (n5Var != null) {
            CharSequence text = n5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f31679n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f31676c;
        if (n5Var2 != null) {
            CharSequence text3 = n5Var2.getText();
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
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f31673a0) {
            f10 = 56.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.T ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        int i7;
        TextView textView = this.f31680r;
        if (textView == null) {
            return;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        textView.setVisibility(i7);
    }

    public void setAvatarPadding(int i7) {
        b(i7, 0);
    }

    public void setCallCellStyle(int i7) {
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        int i12;
        float f13;
        float f14;
        float f15;
        this.f31673a0 = true;
        org.telegram.ui.ActionBar.n5 n5Var = this.f31674b;
        n5Var.setTextSize(15);
        boolean z10 = gd.f24216a0;
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
            f10 = i7 + 66;
        }
        if (z10) {
            f11 = i7 + 66;
        } else {
            f11 = 30.0f;
        }
        n5Var.setLayoutParams(c8.ma.d(-1, 20.0f, i14, f10, 10.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f31676c;
        n5Var2.setTextSize(13);
        boolean z11 = gd.f24216a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 30.0f;
        } else {
            f12 = i7 + 66;
        }
        if (z11) {
            f16 = i7 + 66;
        }
        n5Var2.setLayoutParams(c8.ma.d(-1, 20.0f, i15, f12, 32.0f, f16, 0.0f));
        int L = org.telegram.messenger.g0.L(22.0f);
        fi.t3 t3Var = this.f31672a;
        t3Var.setRoundRadius(L);
        boolean z12 = gd.f24216a0;
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
            f13 = i7 + 8;
        }
        if (z12) {
            f14 = i7 + 8;
        } else {
            f14 = 0.0f;
        }
        t3Var.setLayoutParams(c8.ma.d(44, 44.0f, i16, f13, 6.0f, f14, 0.0f));
        mp mpVar = this.f31677e;
        if (mpVar != null) {
            boolean z13 = gd.f24216a0;
            if (z13) {
                i13 = 5;
            }
            int i17 = i13 | 48;
            if (z13) {
                f15 = 0.0f;
            } else {
                f15 = i7 + 37;
            }
            if (z13) {
                f17 = i7 + 37;
            }
            mpVar.setLayoutParams(c8.ma.d(24, 24.0f, i17, f15, 32.0f, f17, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f31678f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f10;
        float f11;
        if (onClickListener == null) {
            ImageView imageView = this.f31684y;
            if (imageView != null) {
                removeView(imageView);
                this.f31684y = null;
                return;
            }
            return;
        }
        if (this.f31684y == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f31684y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            c8.ra.a(this.f31684y);
            this.f31684y.setImageResource(2131231269);
            ImageView imageView3 = this.f31684y;
            int i7 = org.telegram.ui.ActionBar.n6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.i6 i6Var = this.E;
            org.telegram.ui.ActionBar.u6.s(imageView3, i7, i6Var, mode);
            ImageView imageView4 = this.f31684y;
            int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
            int i11 = 5;
            org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 5, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
            ImageView imageView5 = this.f31684y;
            boolean z10 = gd.f24216a0;
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
            addView(imageView5, c8.ma.d(30, 30.0f, i12, f10, 0.0f, f11, 0.0f));
        }
        this.f31684y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i7) {
        this.K = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f31674b.setTypeface(typeface);
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
            int i7 = this.R;
            int i10 = this.S;
            org.telegram.ui.ActionBar.i6 i6Var = this.E;
            if (!this.f31675b0) {
                this.R = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
                this.S = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zl, i6Var);
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.f31676c;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == i10 && i10 != i7) {
                    n5Var.setTextColor(this.S);
                } else if (textColor == i7) {
                    n5Var.setTextColor(this.R);
                }
            }
            fi.t3 t3Var = this.f31672a;
            if (t3Var != null) {
                t3Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public qa(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        int i12;
        float f10;
        this.Q = j10.f24773t0;
        this.U = new k6(this);
        this.E = i6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f31680r = textView;
            textView.setGravity(17);
            org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.Ji, i6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 14.0f));
            textView.setText(gd.M0(2131754484, null));
            textView.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
            boolean z12 = gd.f24216a0;
            addView(textView, c8.ma.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f)) / org.telegram.messenger.g0.f24120p);
        } else {
            i11 = 0;
        }
        this.R = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
        this.S = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zl, i6Var);
        this.F = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        fi.t3 t3Var = new fi.t3(3, context, this);
        this.f31672a = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z13 = gd.f24216a0;
        addView(t3Var, c8.ma.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i7 + 7, 6.0f, z13 ? i7 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f31674b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(16);
        n5Var.setGravity((gd.f24216a0 ? 5 : 3) | 48);
        boolean z14 = gd.f24216a0;
        int i13 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i7 + 64;
        }
        float f11 = i12;
        if (z14) {
            f10 = i7 + 64;
        } else {
            f10 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(n5Var, c8.ma.d(-1, 20.0f, i13, f11, 10.0f, f10, 0.0f));
        this.f31682w = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), n5Var);
        this.f31683x = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f31676c = n5Var2;
        n5Var2.setTextSize(15);
        n5Var2.setGravity((gd.f24216a0 ? 5 : 3) | 48);
        boolean z15 = gd.f24216a0;
        addView(n5Var2, c8.ma.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i11 + 28 : i7 + 64, 32.0f, z15 ? i7 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i14 = org.telegram.ui.ActionBar.n6.f29561m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i14, i6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = gd.f24216a0;
        addView(imageView, c8.ma.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f31678f = checkBoxSquare;
            boolean z17 = gd.f24216a0;
            addView(checkBoxSquare, c8.ma.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            mp mpVar = new mp(21, context, i6Var);
            this.f31677e = mpVar;
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
            mpVar.b(-1, org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.f29526k7);
            boolean z18 = gd.f24216a0;
            addView(mpVar, c8.ma.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i7 + 24, 36.0f, z18 ? i7 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.Fi, i6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = gd.f24216a0;
            addView(imageView2, c8.ma.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i7 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i7 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f31679n = textView2;
            c8.ra.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29554li, i6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = gd.f24216a0;
            addView(textView2, c8.ma.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
