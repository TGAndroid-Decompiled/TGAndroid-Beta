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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.y31;
import org.telegram.ui.qh0;
public class pa extends FrameLayout implements ls, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 D;
    public final org.telegram.ui.Components.w8 E;
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
    public final k6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final di.d4 f29755a;
    public boolean f29756a0;
    public final org.telegram.ui.ActionBar.l5 f29757b;
    public final org.telegram.ui.ActionBar.l5 f29758c;
    public final ImageView d;
    public final wo f29759e;
    public final CheckBoxSquare f29760f;
    public final ImageView h;
    public final TextView f29761n;
    public final TextView f29762r;
    public Drawable f29763s;
    public final org.telegram.ui.Components.g5 f29764w;
    public final org.telegram.ui.Components.g5 f29765x;
    public ImageView f29766y;

    public pa(Context context, int i7, int i10, boolean z9) {
        this(i7, i10, context, null, z9, false);
    }

    public final void a(String str, boolean z9, boolean z10, boolean z11, View.OnClickListener onClickListener) {
        int i7;
        int i10;
        TextView textView = this.f29761n;
        if (textView == null) {
            return;
        }
        if (z10) {
            i7 = org.telegram.ui.ActionBar.l6.f28136ri;
        } else if (z9) {
            i7 = org.telegram.ui.ActionBar.l6.f28116qi;
        } else if (z11 && TextUtils.isEmpty(str)) {
            i7 = org.telegram.ui.ActionBar.l6.Ci;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.Zd;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.D;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        if (!z9 && !z10) {
            if (z11 && TextUtils.isEmpty(str)) {
                textView.setText(id.M0(2131754382, null));
                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                textView.setTranslationX(org.telegram.messenger.g0.L(6.0f));
                y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.12f, w02), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
                org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.12f, i7);
                textView.setBackground(a02);
                org.telegram.ui.ActionBar.s6.j(textView, a02, null, K, g6Var);
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
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.l6.r1(0.12f, w02));
            org.telegram.ui.ActionBar.o6 K2 = org.telegram.ui.ActionBar.s6.K(0.12f, i7);
            textView.setBackground(d02);
            org.telegram.ui.ActionBar.s6.j(textView, d02, K2, null, g6Var);
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z11) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (str == null && !z11) {
            h(0, false);
            return;
        }
        CharSequence text = textView.getText();
        h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27995k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28136ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28116qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Zd));
    }

    public final void b(int i7, int i10) {
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        di.d4 d4Var = this.f29755a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        float f15 = 0.0f;
        if (id.f23157a0) {
            f10 = 0.0f;
        } else {
            f10 = i7 + 7;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (id.f23157a0) {
            f11 = i7 + 7;
        } else {
            f11 = 0.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        d4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f29757b.getLayoutParams();
        boolean z9 = id.f23157a0;
        int i13 = 0;
        CheckBoxSquare checkBoxSquare = this.f29760f;
        if (z9) {
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
        if (id.f23157a0) {
            f12 = i7 + 64 + i10;
        } else {
            if (checkBoxSquare != null) {
                i13 = 18;
            }
            f12 = i13 + 28;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f12);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f29758c.getLayoutParams();
        float f16 = 28.0f;
        if (id.f23157a0) {
            f13 = 28.0f;
        } else {
            f13 = i7 + 64 + i10;
        }
        layoutParams3.leftMargin = org.telegram.messenger.g0.L(f13);
        if (id.f23157a0) {
            f16 = i7 + 64 + i10;
        }
        layoutParams3.rightMargin = org.telegram.messenger.g0.L(f16);
        wo woVar = this.f29759e;
        if (woVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
            if (id.f23157a0) {
                f14 = 0.0f;
            } else {
                f14 = i7 + 32 + i10;
            }
            layoutParams4.leftMargin = org.telegram.messenger.g0.L(f14);
            if (id.f23157a0) {
                f15 = i7 + 32 + i10;
            }
            layoutParams4.rightMargin = org.telegram.messenger.g0.L(f15);
        }
    }

    public final void c(boolean z9, boolean z10) {
        int i7 = 0;
        wo woVar = this.f29759e;
        if (woVar != null) {
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(z9, z10);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f29760f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z9, z10);
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            if (!z9) {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        org.telegram.ui.ActionBar.l5 l5Var = this.f29757b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            l5Var.l("", false);
            this.f29758c.l("", false);
            this.f29755a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && l5Var != null) {
            try {
                charSequence = org.telegram.messenger.i6.m(charSequence, l5Var.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z9;
        setWillNotDraw(!z9);
        i(0);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25018i4) {
            this.f29757b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.V && view == this.f29755a) {
            bg.s.a(canvas, org.telegram.ui.ActionBar.l6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(TLRPC.User user, boolean z9) {
        d(user, null, null, z9);
    }

    public final void f(qh0 qh0Var, CharSequence charSequence, boolean z9) {
        String M0;
        Object a22;
        boolean z10 = qh0Var.f49062e;
        int i7 = this.P;
        if (z10) {
            int i10 = qh0Var.f49061c;
            if (i10 <= 0 && qh0Var.f49063f) {
                M0 = id.M0(2131748039, null);
            } else if (i10 <= 0) {
                M0 = id.M0(2131748040, null);
            } else {
                M0 = id.M0(2131748044, null);
            }
        } else {
            boolean z11 = qh0Var.f49060b;
            int i11 = qh0Var.f49061c;
            int i12 = qh0Var.f49059a;
            int i13 = 2131747856;
            boolean z12 = true;
            if (i11 == 3 && i12 != Integer.MAX_VALUE) {
                int currentTime = i12 - ConnectionsManager.getInstance(i7).getCurrentTime();
                if (currentTime <= 0) {
                    if (z11) {
                        M0 = id.M0(2131747918, null);
                    } else {
                        M0 = id.M0(2131747856, null);
                    }
                } else if (currentTime < 3600) {
                    M0 = id.a0("WillUnmuteIn", null, 2131742865, id.G(currentTime / 60, "Minutes", new Object[0]));
                } else if (currentTime < 86400) {
                    M0 = id.a0("WillUnmuteIn", null, 2131742865, id.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else if (currentTime < 31536000) {
                    M0 = id.a0("WillUnmuteIn", null, 2131742865, id.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                } else {
                    M0 = null;
                }
            } else {
                if (i11 != 0 && i11 != 1) {
                    z12 = false;
                }
                if (z12 && z11) {
                    M0 = id.M0(2131747918, null);
                } else {
                    if (!z12) {
                        i13 = 2131747901;
                    }
                    M0 = id.M0(i13, null);
                }
            }
            if (M0 == null) {
                M0 = id.M0(2131747894, null);
            }
            if (qh0Var.f49063f) {
                M0 = rf.b.r(M0, ", Auto");
            }
        }
        if (org.telegram.messenger.m5.C(qh0Var.d)) {
            TLRPC.EncryptedChat a12 = qp.s1(i7).a1(Integer.valueOf((int) (qh0Var.d & 4294967295L)));
            if (a12 != null && (a22 = qp.s1(i7).a2(Long.valueOf(a12.user_id))) != null) {
                d(a22, charSequence, M0, false);
            }
        } else if (org.telegram.messenger.m5.E(qh0Var.d)) {
            Object a23 = qp.s1(i7).a2(Long.valueOf(qh0Var.d));
            if (a23 != null) {
                d(a23, charSequence, M0, z9);
            }
        } else {
            Object M02 = qp.s1(i7).M0(Long.valueOf(-qh0Var.d));
            if (M02 != null) {
                d(M02, charSequence, M0, z9);
            }
        }
    }

    public final void g(int i7, y31 y31Var, boolean z9) {
        CharSequence M0;
        CharSequence M02;
        long j3 = y31Var.f40579x;
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            String n10 = t10.n(a22);
            if (a22 != null) {
                if (!TextUtils.isEmpty(n10)) {
                    M02 = rf.b.i("@", n10);
                } else if (a22.bot) {
                    M02 = id.M0(2131753156, null);
                } else if (a22.contact) {
                    M02 = id.M0(2131750792, null);
                } else {
                    M02 = id.M0(2131750721, null);
                }
                d(a22, null, M02, z9);
                return;
            }
            return;
        }
        TLRPC.Chat M03 = qp.s1(i7).M0(Long.valueOf(-j3));
        if (M03 != null) {
            if (M03.participants_count != 0) {
                if (org.telegram.messenger.t3.V(M03)) {
                    M0 = id.H(',', "Subscribers", M03.participants_count);
                } else {
                    M0 = id.H(',', "Members", M03.participants_count);
                }
            } else if (!org.telegram.messenger.t3.t0(M03)) {
                if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                    M0 = id.M0(2131752329, null);
                } else {
                    M0 = id.M0(2131748641, null);
                }
            } else if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                M0 = id.M0(2131752318, null);
            } else {
                M0 = id.M0(2131748638, null);
            }
            d(M03, null, M0, z9);
        }
    }

    public Object getCurrentObject() {
        return this.G;
    }

    public long getDialogId() {
        return this.U;
    }

    public CharSequence getName() {
        return this.f29757b.getText();
    }

    public final void h(int i7, boolean z9) {
        int i10;
        int i11;
        int i12;
        if (i7 > 0) {
            i7 += org.telegram.messenger.g0.L(6.0f);
        }
        boolean z10 = id.f23157a0;
        if (z10) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (!z10) {
            i11 = i7;
        } else {
            i11 = 0;
        }
        this.f29757b.setPadding(i10, 0, i11, 0);
        if (z9) {
            boolean z11 = id.f23157a0;
            if (z11) {
                i12 = i7;
            } else {
                i12 = 0;
            }
            if (z11) {
                i7 = 0;
            }
            this.f29758c.setPadding(i12, 0, i7, 0);
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
        CheckBoxSquare checkBoxSquare = this.f29760f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.f25018i4);
        this.f29765x.a();
        this.f29764w.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.f25018i4);
        this.f29765x.b();
        this.f29764w.b();
        this.T.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.S) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f29760f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            wo woVar = this.f29759e;
            if (woVar != null && woVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(woVar.f40108a.f31268q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.l5 l5Var = this.f29757b;
        if (l5Var != null) {
            CharSequence text = l5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f29761n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f29758c;
        if (l5Var2 != null) {
            CharSequence text3 = l5Var2.getText();
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
        if (this.W) {
            f10 = 56.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.S ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z9) {
        int i7;
        TextView textView = this.f29762r;
        if (textView == null) {
            return;
        }
        if (z9) {
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
        this.W = true;
        org.telegram.ui.ActionBar.l5 l5Var = this.f29757b;
        l5Var.setTextSize(15);
        boolean z9 = id.f23157a0;
        int i13 = 3;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i14 = i10 | 48;
        float f16 = 30.0f;
        if (z9) {
            f10 = 30.0f;
        } else {
            f10 = i7 + 66;
        }
        if (z9) {
            f11 = i7 + 66;
        } else {
            f11 = 30.0f;
        }
        l5Var.setLayoutParams(c8.ha.d(-1, 20.0f, i14, f10, 10.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f29758c;
        l5Var2.setTextSize(13);
        boolean z10 = id.f23157a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z10) {
            f12 = 30.0f;
        } else {
            f12 = i7 + 66;
        }
        if (z10) {
            f16 = i7 + 66;
        }
        l5Var2.setLayoutParams(c8.ha.d(-1, 20.0f, i15, f12, 32.0f, f16, 0.0f));
        int L = org.telegram.messenger.g0.L(22.0f);
        di.d4 d4Var = this.f29755a;
        d4Var.setRoundRadius(L);
        boolean z11 = id.f23157a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        float f17 = 0.0f;
        if (z11) {
            f13 = 0.0f;
        } else {
            f13 = i7 + 8;
        }
        if (z11) {
            f14 = i7 + 8;
        } else {
            f14 = 0.0f;
        }
        d4Var.setLayoutParams(c8.ha.d(44, 44.0f, i16, f13, 6.0f, f14, 0.0f));
        wo woVar = this.f29759e;
        if (woVar != null) {
            boolean z12 = id.f23157a0;
            if (z12) {
                i13 = 5;
            }
            int i17 = i13 | 48;
            if (z12) {
                f15 = 0.0f;
            } else {
                f15 = i7 + 37;
            }
            if (z12) {
                f17 = i7 + 37;
            }
            woVar.setLayoutParams(c8.ha.d(24, 24.0f, i17, f15, 32.0f, f17, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z9) {
        CheckBoxSquare checkBoxSquare = this.f29760f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z9);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f10;
        float f11;
        if (onClickListener == null) {
            ImageView imageView = this.f29766y;
            if (imageView != null) {
                removeView(imageView);
                this.f29766y = null;
                return;
            }
            return;
        }
        if (this.f29766y == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f29766y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            c8.ka.a(this.f29766y);
            this.f29766y.setImageResource(2131231269);
            ImageView imageView3 = this.f29766y;
            int i7 = org.telegram.ui.ActionBar.l6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.g6 g6Var = this.D;
            org.telegram.ui.ActionBar.s6.s(imageView3, i7, g6Var, mode);
            ImageView imageView4 = this.f29766y;
            int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
            int i11 = 5;
            org.telegram.ui.ActionBar.s6.Q(imageView4, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 5, -1), null, org.telegram.ui.ActionBar.s6.M(i10), g6Var);
            ImageView imageView5 = this.f29766y;
            boolean z9 = id.f23157a0;
            if (z9) {
                i11 = 3;
            }
            int i12 = i11 | 16;
            if (z9) {
                f10 = 14.0f;
            } else {
                f10 = 0.0f;
            }
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = 14.0f;
            }
            addView(imageView5, c8.ha.d(30, 30.0f, i12, f10, 0.0f, f11, 0.0f));
        }
        this.f29766y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i7) {
        this.J = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f29757b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z9) {
        this.K = z9;
    }

    @Override
    public final void updateColors() {
        try {
            int i7 = this.Q;
            int i10 = this.R;
            org.telegram.ui.ActionBar.g6 g6Var = this.D;
            if (!this.f29756a0) {
                this.Q = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
                this.R = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wl, g6Var);
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.f29758c;
            if (l5Var != null) {
                int textColor = l5Var.getTextColor();
                if (textColor == i10 && i10 != i7) {
                    l5Var.setTextColor(this.R);
                } else if (textColor == i7) {
                    l5Var.setTextColor(this.Q);
                }
            }
            di.d4 d4Var = this.f29755a;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public pa(int i7, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(context);
        int i11;
        int i12;
        float f10;
        this.P = p10.f24470s0;
        this.T = new k6(this);
        this.D = g6Var;
        if (z10) {
            TextView textView = new TextView(context);
            this.f29762r = textView;
            textView.setGravity(17);
            org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.Gi, g6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 14.0f));
            textView.setText(id.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
            boolean z11 = id.f23157a0;
            addView(textView, c8.ha.d(-2, 28.0f, (z11 ? 3 : 5) | 48, z11 ? 14.0f : 0.0f, 15.0f, z11 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f)) / org.telegram.messenger.g0.f22562p);
        } else {
            i11 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        this.R = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wl, g6Var);
        this.E = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        di.d4 d4Var = new di.d4(3, context, this);
        this.f29755a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = id.f23157a0;
        addView(d4Var, c8.ha.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i7 + 7, 6.0f, z12 ? i7 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f29757b = l5Var;
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(16);
        l5Var.setGravity((id.f23157a0 ? 5 : 3) | 48);
        boolean z13 = id.f23157a0;
        int i13 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i7 + 64;
        }
        float f11 = i12;
        if (z13) {
            f10 = i7 + 64;
        } else {
            f10 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(l5Var, c8.ha.d(-1, 20.0f, i13, f11, 10.0f, f10, 0.0f));
        this.f29764w = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), l5Var);
        this.f29765x = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f29758c = l5Var2;
        l5Var2.setTextSize(15);
        l5Var2.setGravity((id.f23157a0 ? 5 : 3) | 48);
        boolean z14 = id.f23157a0;
        addView(l5Var2, c8.ha.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? i11 + 28 : i7 + 64, 32.0f, z14 ? i7 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i14 = org.telegram.ui.ActionBar.l6.f28030m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView, i14, g6Var, mode);
        imageView.setVisibility(8);
        boolean z15 = id.f23157a0;
        addView(imageView, c8.ha.d(-2, -2.0f, (z15 ? 5 : 3) | 16, z15 ? 0.0f : 16.0f, 0.0f, z15 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f29760f = checkBoxSquare;
            boolean z16 = id.f23157a0;
            addView(checkBoxSquare, c8.ha.d(18, 18.0f, (z16 ? 3 : 5) | 16, z16 ? 19.0f : 0.0f, 0.0f, z16 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            wo woVar = new wo(21, context, g6Var);
            this.f29759e = woVar;
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
            boolean z17 = id.f23157a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z17 ? 5 : 3) | 48, z17 ? 0.0f : i7 + 24, 36.0f, z17 ? i7 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131230862);
            org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.Ci, g6Var, mode);
            imageView2.setVisibility(8);
            boolean z18 = id.f23157a0;
            addView(imageView2, c8.ha.d(24, 24.0f, (z18 ? 3 : 5) | 16, z18 ? i7 + 10 : 0.0f, 0.0f, z18 ? 0.0f : i7 + 10, 0.0f));
        }
        if (z9) {
            TextView textView2 = new TextView(context);
            this.f29761n = textView2;
            c8.ka.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f27967ii, g6Var);
            textView2.setImportantForAccessibility(2);
            boolean z19 = id.f23157a0;
            addView(textView2, c8.ha.d(-2, -2.0f, (z19 ? 3 : 5) | 48, z19 ? 23.0f : 0.0f, 10.0f, z19 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
