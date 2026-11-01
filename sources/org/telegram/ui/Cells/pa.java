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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ep;
import org.telegram.ui.si0;
public class pa extends FrameLayout implements vs, org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 D;
    public final org.telegram.ui.Components.r8 E;
    public boolean F;
    public Object G;
    public CharSequence H;
    public CharSequence I;
    public int J;
    public boolean K;
    public String L;
    public String M;
    public int N;
    public TLRPC.FileLocation O;
    public final int P;
    public int Q;
    public int R;
    public boolean S;
    public final o6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final ag.d2 f22469a;
    public boolean f22470a0;
    public final org.telegram.ui.ActionBar.u5 f22471b;
    public final org.telegram.ui.ActionBar.u5 f22472c;
    public final ImageView d;
    public final ep e;
    public final CheckBoxSquare f22473f;
    public final ImageView h;
    public final TextView f22474n;
    public final TextView f22475r;
    public Drawable f22476s;
    public final org.telegram.ui.Components.d5 f22477w;
    public final org.telegram.ui.Components.d5 f22478x;
    public ImageView f22479y;

    public pa(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int i10;
        int i11;
        TextView textView = this.f22474n;
        if (textView == null) {
            return;
        }
        if (z11) {
            i10 = org.telegram.ui.ActionBar.t6.ri;
        } else if (z10) {
            i10 = org.telegram.ui.ActionBar.t6.qi;
        } else if (z12 && TextUtils.isEmpty(str)) {
            i10 = org.telegram.ui.ActionBar.t6.Ci;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Zd;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setText(dd.L0(2131754382, null));
                textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(0.66f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f));
                textView.setTranslationX(org.telegram.messenger.i0.L(6.0f));
                y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.12f, w02), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
                org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.12f, i10);
                textView.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(textView, a02, null, L, p6Var);
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
            textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(0.66f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f));
            textView.setTranslationX(org.telegram.messenger.i0.L(6.0f));
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(32.0f), org.telegram.ui.ActionBar.t6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i10);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(textView, d02, L2, null, p6Var);
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z12) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        if (str == null && !z12) {
            h(0, false);
            return;
        }
        CharSequence text = textView.getText();
        h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21060k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zd));
    }

    public final void b(int i10, int i11) {
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        float f13;
        int i13;
        ag.d2 d2Var = this.f22469a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        float f14 = 0.0f;
        if (dd.X) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 7;
        }
        layoutParams.leftMargin = org.telegram.messenger.i0.L(f7);
        if (dd.X) {
            f10 = i10 + 7;
        } else {
            f10 = 0.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.i0.L(f10);
        d2Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f22471b.getLayoutParams();
        boolean z10 = dd.X;
        int i14 = 0;
        CheckBoxSquare checkBoxSquare = this.f22473f;
        if (z10) {
            if (checkBoxSquare != null) {
                i13 = 18;
            } else {
                i13 = 0;
            }
            i12 = i13 + 28;
        } else {
            i12 = i10 + 64 + i11;
        }
        layoutParams2.leftMargin = org.telegram.messenger.i0.L(i12);
        if (dd.X) {
            f11 = i10 + 64 + i11;
        } else {
            if (checkBoxSquare != null) {
                i14 = 18;
            }
            f11 = i14 + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.i0.L(f11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22472c.getLayoutParams();
        float f15 = 28.0f;
        if (dd.X) {
            f12 = 28.0f;
        } else {
            f12 = i10 + 64 + i11;
        }
        layoutParams3.leftMargin = org.telegram.messenger.i0.L(f12);
        if (dd.X) {
            f15 = i10 + 64 + i11;
        }
        layoutParams3.rightMargin = org.telegram.messenger.i0.L(f15);
        ep epVar = this.e;
        if (epVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) epVar.getLayoutParams();
            if (dd.X) {
                f13 = 0.0f;
            } else {
                f13 = i10 + 32 + i11;
            }
            layoutParams4.leftMargin = org.telegram.messenger.i0.L(f13);
            if (dd.X) {
                f14 = i10 + 32 + i11;
            }
            layoutParams4.rightMargin = org.telegram.messenger.i0.L(f14);
        }
    }

    public final void c(boolean z10, boolean z11) {
        int i10 = 0;
        ep epVar = this.e;
        if (epVar != null) {
            if (epVar.getVisibility() != 0) {
                epVar.setVisibility(0);
            }
            epVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f22473f;
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
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f22471b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            u5Var.l("", false);
            this.f22472c.l("", false);
            this.f22469a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && u5Var != null) {
            try {
                charSequence = org.telegram.messenger.k6.m(charSequence, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z10;
        setWillNotDraw(!z10);
        i(0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14726i4) {
            this.f22471b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.V && view == this.f22469a) {
            rf.o.a(canvas, org.telegram.ui.ActionBar.t6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(si0 si0Var, CharSequence charSequence, boolean z10) {
        String L0;
        Object Z1;
        boolean z11 = si0Var.e;
        int i10 = this.P;
        if (z11) {
            int i11 = si0Var.f41378c;
            if (i11 <= 0 && si0Var.f41379f) {
                L0 = dd.L0(2131748055, null);
            } else if (i11 <= 0) {
                L0 = dd.L0(2131748056, null);
            } else {
                L0 = dd.L0(2131748060, null);
            }
        } else {
            boolean z12 = si0Var.f41377b;
            int i12 = si0Var.f41378c;
            int i13 = si0Var.f41376a;
            int i14 = 2131747872;
            boolean z13 = true;
            if (i12 == 3 && i13 != Integer.MAX_VALUE) {
                int currentTime = i13 - ConnectionsManager.getInstance(i10).getCurrentTime();
                if (currentTime <= 0) {
                    if (z12) {
                        L0 = dd.L0(2131747934, null);
                    } else {
                        L0 = dd.L0(2131747872, null);
                    }
                } else if (currentTime < 3600) {
                    L0 = dd.a0("WillUnmuteIn", null, 2131742890, dd.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    L0 = dd.a0("WillUnmuteIn", null, 2131742890, dd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    L0 = dd.a0("WillUnmuteIn", null, 2131742890, dd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    L0 = null;
                }
            } else {
                if (i12 != 0 && i12 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    L0 = dd.L0(2131747934, null);
                } else {
                    if (!z13) {
                        i14 = 2131747917;
                    }
                    L0 = dd.L0(i14, null);
                }
            }
            if (L0 == null) {
                L0 = dd.L0(2131747910, null);
            }
            if (si0Var.f41379f) {
                L0 = sc.e.A(L0, ", Auto");
            }
        }
        if (org.telegram.messenger.o5.C(si0Var.d)) {
            TLRPC.EncryptedChat Z0 = wp.r1(i10).Z0(Integer.valueOf((int) (si0Var.d & 4294967295L)));
            if (Z0 != null && (Z1 = wp.r1(i10).Z1(Long.valueOf(Z0.user_id))) != null) {
                d(Z1, charSequence, L0, false);
            }
        } else if (org.telegram.messenger.o5.E(si0Var.d)) {
            Object Z12 = wp.r1(i10).Z1(Long.valueOf(si0Var.d));
            if (Z12 != null) {
                d(Z12, charSequence, L0, z10);
            }
        } else {
            Object L02 = wp.r1(i10).L0(Long.valueOf(-si0Var.d));
            if (L02 != null) {
                d(L02, charSequence, L0, z10);
            }
        }
    }

    public final void g(int i10, b51 b51Var, boolean z10) {
        CharSequence L0;
        CharSequence L02;
        long j10 = b51Var.f24654x;
        if (j10 > 0) {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
            String n10 = i20.n(Z1);
            if (Z1 != null) {
                if (!TextUtils.isEmpty(n10)) {
                    L02 = sc.e.h("@", n10);
                } else if (Z1.bot) {
                    L02 = dd.L0(2131753156, null);
                } else if (Z1.contact) {
                    L02 = dd.L0(2131750793, null);
                } else {
                    L02 = dd.L0(2131750722, null);
                }
                d(Z1, null, L02, z10);
                return;
            }
            return;
        }
        TLRPC.Chat L03 = wp.r1(i10).L0(Long.valueOf(-j10));
        if (L03 != null) {
            if (L03.participants_count != 0) {
                if (org.telegram.messenger.w3.V(L03)) {
                    L0 = dd.H(',', "Subscribers", L03.participants_count);
                } else {
                    L0 = dd.H(',', "Members", L03.participants_count);
                }
            } else if (!org.telegram.messenger.w3.t0(L03)) {
                if (org.telegram.messenger.w3.T(L03) && !L03.megagroup) {
                    L0 = dd.L0(2131752329, null);
                } else {
                    L0 = dd.L0(2131748656, null);
                }
            } else if (org.telegram.messenger.w3.T(L03) && !L03.megagroup) {
                L0 = dd.L0(2131752318, null);
            } else {
                L0 = dd.L0(2131748653, null);
            }
            d(L03, null, L0, z10);
        }
    }

    public Object getCurrentObject() {
        return this.G;
    }

    public long getDialogId() {
        return this.U;
    }

    public CharSequence getName() {
        return this.f22471b.getText();
    }

    public final void h(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (i10 > 0) {
            i10 += org.telegram.messenger.i0.L(6.0f);
        }
        boolean z11 = dd.X;
        if (z11) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        if (!z11) {
            i12 = i10;
        } else {
            i12 = 0;
        }
        this.f22471b.setPadding(i11, 0, i12, 0);
        if (z10) {
            boolean z12 = dd.X;
            if (z12) {
                i13 = i10;
            } else {
                i13 = 0;
            }
            if (z12) {
                i10 = 0;
            }
            this.f22472c.setPadding(i13, 0, i10, 0);
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
        CheckBoxSquare checkBoxSquare = this.f22473f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.e().c(this, at.f14726i4);
        this.f22478x.a();
        this.f22477w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.e().n(this, at.f14726i4);
        this.f22478x.b();
        this.f22477w.b();
        this.T.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.S) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(68.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(68.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f22473f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            ep epVar = this.e;
            if (epVar != null && epVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(epVar.f25895a.f23920q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.u5 u5Var = this.f22471b;
        if (u5Var != null) {
            CharSequence text = u5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f22474n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f22472c;
        if (u5Var2 != null) {
            CharSequence text3 = u5Var2.getText();
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
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.W) {
            f7 = 56.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7) + (this.S ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        int i10;
        TextView textView = this.f22475r;
        if (textView == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
    }

    public void setAvatarPadding(int i10) {
        b(i10, 0);
    }

    public void setCallCellStyle(int i10) {
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        float f13;
        float f14;
        this.W = true;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22471b;
        u5Var.setTextSize(15);
        boolean z10 = dd.X;
        int i14 = 3;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        float f15 = 30.0f;
        if (z10) {
            f7 = 30.0f;
        } else {
            f7 = i10 + 66;
        }
        if (z10) {
            f10 = i10 + 66;
        } else {
            f10 = 30.0f;
        }
        u5Var.setLayoutParams(w7.b6.d(-1, 20.0f, i15, f7, 10.0f, f10, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f22472c;
        u5Var2.setTextSize(13);
        boolean z11 = dd.X;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z11) {
            f11 = 30.0f;
        } else {
            f11 = i10 + 66;
        }
        if (z11) {
            f15 = i10 + 66;
        }
        u5Var2.setLayoutParams(w7.b6.d(-1, 20.0f, i16, f11, 32.0f, f15, 0.0f));
        int L = org.telegram.messenger.i0.L(22.0f);
        ag.d2 d2Var = this.f22469a;
        d2Var.setRoundRadius(L);
        boolean z12 = dd.X;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        float f16 = 0.0f;
        if (z12) {
            f12 = 0.0f;
        } else {
            f12 = i10 + 8;
        }
        if (z12) {
            f13 = i10 + 8;
        } else {
            f13 = 0.0f;
        }
        d2Var.setLayoutParams(w7.b6.d(44, 44.0f, i17, f12, 6.0f, f13, 0.0f));
        ep epVar = this.e;
        if (epVar != null) {
            boolean z13 = dd.X;
            if (z13) {
                i14 = 5;
            }
            int i18 = i14 | 48;
            if (z13) {
                f14 = 0.0f;
            } else {
                f14 = i10 + 37;
            }
            if (z13) {
                f16 = i10 + 37;
            }
            epVar.setLayoutParams(w7.b6.d(24, 24.0f, i18, f14, 32.0f, f16, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f22473f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f7;
        float f10;
        if (onClickListener == null) {
            ImageView imageView = this.f22479y;
            if (imageView != null) {
                removeView(imageView);
                this.f22479y = null;
                return;
            }
            return;
        }
        if (this.f22479y == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f22479y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            w7.e6.a(this.f22479y);
            this.f22479y.setImageResource(2131231270);
            ImageView imageView3 = this.f22479y;
            int i10 = org.telegram.ui.ActionBar.t6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.p6 p6Var = this.D;
            org.telegram.ui.ActionBar.a7.t(imageView3, i10, p6Var, mode);
            ImageView imageView4 = this.f22479y;
            int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
            int i12 = 5;
            org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 5, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
            ImageView imageView5 = this.f22479y;
            boolean z10 = dd.X;
            if (z10) {
                i12 = 3;
            }
            int i13 = i12 | 16;
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 0.0f;
            }
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 14.0f;
            }
            addView(imageView5, w7.b6.d(30, 30.0f, i13, f7, 0.0f, f10, 0.0f));
        }
        this.f22479y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.J = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f22471b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void updateColors() {
        try {
            int i10 = this.Q;
            int i11 = this.R;
            org.telegram.ui.ActionBar.p6 p6Var = this.D;
            if (!this.f22470a0) {
                this.Q = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
                this.R = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wl, p6Var);
            }
            org.telegram.ui.ActionBar.u5 u5Var = this.f22472c;
            if (u5Var != null) {
                int textColor = u5Var.getTextColor();
                if (textColor == i11 && i11 != i10) {
                    u5Var.setTextColor(this.R);
                } else if (textColor == i10) {
                    u5Var.setTextColor(this.Q);
                }
            }
            ag.d2 d2Var = this.f22469a;
            if (d2Var != null) {
                d2Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public pa(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.P = e20.f15506s0;
        this.T = new o6(this);
        this.D = p6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f22475r = textView;
            textView.setGravity(17);
            org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Gi, p6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 14.0f));
            textView.setText(dd.L0(2131754486, null));
            textView.setPadding(org.telegram.messenger.i0.L(17.0f), 0, org.telegram.messenger.i0.L(17.0f), 0);
            boolean z12 = dd.X;
            addView(textView, w7.b6.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.i0.L(48.0f)) / org.telegram.messenger.i0.f16171p);
        } else {
            i12 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        this.R = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wl, p6Var);
        this.E = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ag.d2 d2Var = new ag.d2(this, context, 2);
        this.f22469a = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z13 = dd.X;
        addView(d2Var, w7.b6.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f22471b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setGravity((dd.X ? 5 : 3) | 48);
        boolean z14 = dd.X;
        int i15 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f7 = i13;
        if (z14) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(u5Var, w7.b6.d(-1, 20.0f, i15, f7, 10.0f, i14, 0.0f));
        this.f22477w = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), u5Var);
        this.f22478x = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f22472c = u5Var2;
        u5Var2.setTextSize(15);
        u5Var2.setGravity((dd.X ? 5 : 3) | 48);
        boolean z15 = dd.X;
        addView(u5Var2, w7.b6.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.t6.f21096m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = dd.X;
        addView(imageView, w7.b6.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f22473f = checkBoxSquare;
            boolean z17 = dd.X;
            addView(checkBoxSquare, w7.b6.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            ep epVar = new ep(21, context, p6Var);
            this.e = epVar;
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            epVar.b(-1, org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.f21060k7);
            boolean z18 = dd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Ci, p6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = dd.X;
            addView(imageView2, w7.b6.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f22474n = textView2;
            w7.e6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21031ii, p6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = dd.X;
            addView(textView2, w7.b6.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
