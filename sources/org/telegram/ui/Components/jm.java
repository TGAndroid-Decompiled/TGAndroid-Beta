package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class jm extends kj0 {
    public final Context f36513c;
    public final boolean d;
    public boolean f36514e;
    public boolean f36515f;
    public final ArrayList h = new ArrayList(8);
    public int f36516n;
    public int f36517r;
    public boolean f36518s;
    public final ChatAttachAlertPhotoLayout f36519w;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.f36519w = chatAttachAlertPhotoLayout;
        this.f36513c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final boolean E(ek0 ek0Var) {
        org.telegram.messenger.ve veVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f32765s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        if ((!isEmpty || ((veVar = chatAttachAlertPhotoLayout.U0) != null && !veVar.f27321e.isEmpty())) && chatAttachAlertPhotoLayout.f37477b.M1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.ff M = M(i7);
        if (M == null) {
            int i10 = this.f36517r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32765s1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.ff) arrayList2.get(0);
                } else {
                    org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
                    if (veVar != null && (arrayList = veVar.f27321e) != null) {
                        M = (org.telegram.messenger.ff) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.f27321e.isEmpty()) {
                M = (org.telegram.messenger.ff) i5.c.h(1, chatAttachAlertPhotoLayout.U0.f27321e);
            }
        }
        if (M != null) {
            long j3 = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j3 /= 1000;
            }
            return org.telegram.messenger.hd.e0(j3, true);
        }
        return "";
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (ek0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = ek0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(ek0 ek0Var) {
        int i7 = this.f36519w.N0;
        int ceil = (int) Math.ceil(this.f36516n / i7);
        if (ek0Var.getChildCount() != 0) {
            int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ek0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / i7) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (ek0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(ek0 ek0Var) {
        this.f36518s = false;
        int childCount = ek0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ek0Var.getChildAt(i7).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f36518s = true;
    }

    public final mj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.f36513c, chatAttachAlertPhotoLayout.f37476a);
        if (this == chatAttachAlertPhotoLayout.H) {
            s5Var.setOutlineProvider(new fh.a(this, 3));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new c0(this, 21));
        s5Var.setDelegate(new h2(11, this, s5Var));
        return new v4.e1(s5Var);
    }

    public final org.telegram.messenger.ff M(int i7) {
        boolean z10 = this.f36515f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        if (z10 && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f32764r1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override
    public final int b() {
        int i7 = 0;
        this.f36514e = false;
        this.f36515f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        jm jmVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.f32809w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == jmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.f36514e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.f32784h1) {
            i7++;
        }
        if (z10 && this == jmVar) {
            i7++;
        }
        this.f36517r = i7;
        if (!z10) {
            i7 += ChatAttachAlertPhotoLayout.f32765s1.size();
            org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
            if (veVar != null) {
                i7 += veVar.f27321e.size();
            }
        }
        if (this.f36514e && i7 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f36515f = true;
            i7++;
        }
        if (this == jmVar) {
            i7++;
        }
        this.f36516n = i7;
        return i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        jm jmVar = chatAttachAlertPhotoLayout.H;
        if (chatAttachAlertPhotoLayout.f32809w0) {
            boolean z10 = chatAttachAlertPhotoLayout.Q0;
            if (z10 && this == jmVar) {
                if (i7 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                if (!chatAttachAlertPhotoLayout.P0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f36515f;
            if (z12 && i7 == chatAttachAlertPhotoLayout.N0) {
                return 5;
            }
            if (z12 && i7 > chatAttachAlertPhotoLayout.N0) {
                i10 = i7 - 1;
            } else {
                i10 = i7;
            }
            if (z11) {
                i10--;
            }
            if (chatAttachAlertPhotoLayout.f32784h1 && i10 == 0) {
                return 4;
            }
            if (this == jmVar && i7 == this.f36516n - 1) {
                return 2;
            }
            if (z10) {
                return 3;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void f() {
        int i7;
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        if (this == chatAttachAlertPhotoLayout.H) {
            vy vyVar = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.f32809w0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            vyVar.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z15 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((k10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f32784h1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                if (!z15 || !chatAttachAlertPhotoLayout.P0 || i7 != 0) {
                    i11 = 1;
                }
                n5Var.setType(i11);
                return;
            }
            ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.L0);
            return;
        }
        if (this.f36515f && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (z15 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.f32784h1) {
            i7--;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.f32803s.f59064o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.setIsVertical(z10);
        }
        if (uiVar.O2 == 0 && !uiVar.R2 && !uiVar.C1) {
            s5Var.getCheckBox().setVisibility(0);
        } else {
            s5Var.getCheckBox().setVisibility(8);
        }
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i12 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32766t1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i7 == b() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (uiVar != null && uiVar.d2) {
            z14 = true;
        } else {
            z14 = false;
        }
        s5Var.d(e02, z11, z12, z13, z14);
        if ((uiVar.f40352a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
            s5Var.b(ChatAttachAlertPhotoLayout.f32767u1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.f32811x0 && e02.f28023b) {
            s5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f32813y0 && !e02.f28023b) {
            s5Var.setAlpha(0.3f);
        } else {
            s5Var.setAlpha(1.0f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i7));
        s5Var.setTag(Integer.valueOf(i7));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36519w;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        org.telegram.ui.ActionBar.h6 h6Var = chatAttachAlertPhotoLayout.f37476a;
        if (i7 != 0) {
            Context context = this.f36513c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f31110a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i10 = org.telegram.ui.ActionBar.m6.f29293aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, mode);
                                    frameLayout.addView(imageView, c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f31111b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.f29314ba, h6Var, mode);
                                    frameLayout.addView(imageView2, c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f31112c = textView;
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29333ca, h6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, c8.na.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.g0.L(80.0f);
                                    return new v4.e1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                                hi.d dVar = new hi.d(context, h6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new nq(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.N0(2131750464, null));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, c8.na.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new v4.e1(frameLayout2);
                            }
                            k10 k10Var = new k10(context, uiVar.H3);
                            k10Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(400.0f)));
                            k10Var.setGravity(17);
                            k10Var.isClickable();
                            k10Var.f36710b.setOnClickListener(new o0(new sl(chatAttachAlertPhotoLayout, 5), 19));
                            k10Var.f36709a.setOnClickListener(new o0(new sl(chatAttachAlertPhotoLayout, 6), 20));
                            k10Var.f36711c.setOnClickListener(new m8(15, k10Var, new z2(this, 4)));
                            return new v4.e1(k10Var);
                        }
                        return new v4.e1(new View(context));
                    }
                    uiVar.getClass();
                    return new v4.e1(new im(this, context));
                }
                return new v4.e1(new bi.o3(15, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f31073a = org.telegram.messenger.g0.L(0.0f);
            return new v4.e1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            mj0 mj0Var = (mj0) arrayList.get(0);
            arrayList.remove(0);
            return mj0Var;
        }
        return L();
    }

    @Override
    public final void y(v4.e1 e1Var) {
        if (e1Var.f59111a instanceof org.telegram.ui.Cells.m5) {
            this.f36519w.R.i();
        }
    }
}
