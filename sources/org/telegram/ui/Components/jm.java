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
    public final Context f36554c;
    public final boolean d;
    public boolean f36555e;
    public boolean f36556f;
    public final ArrayList h = new ArrayList(8);
    public int f36557n;
    public int f36558r;
    public boolean f36559s;
    public final ChatAttachAlertPhotoLayout f36560w;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.f36560w = chatAttachAlertPhotoLayout;
        this.f36554c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final boolean E(ek0 ek0Var) {
        org.telegram.messenger.ve veVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f32799s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        if ((!isEmpty || ((veVar = chatAttachAlertPhotoLayout.U0) != null && !veVar.f27357e.isEmpty())) && chatAttachAlertPhotoLayout.f37519b.M1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.ff M = M(i7);
        if (M == null) {
            int i10 = this.f36558r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32799s1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.ff) arrayList2.get(0);
                } else {
                    org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
                    if (veVar != null && (arrayList = veVar.f27357e) != null) {
                        M = (org.telegram.messenger.ff) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.f27357e.isEmpty()) {
                M = (org.telegram.messenger.ff) i5.c.h(1, chatAttachAlertPhotoLayout.U0.f27357e);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
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
        int i7 = this.f36560w.N0;
        int ceil = (int) Math.ceil(this.f36557n / i7);
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
        this.f36559s = false;
        int childCount = ek0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ek0Var.getChildAt(i7).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f36559s = true;
    }

    public final mj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.f36554c, chatAttachAlertPhotoLayout.f37518a);
        if (this == chatAttachAlertPhotoLayout.H) {
            s5Var.setOutlineProvider(new fh.a(this, 3));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new c0(this, 21));
        s5Var.setDelegate(new h2(11, this, s5Var));
        return new v4.f1(s5Var);
    }

    public final org.telegram.messenger.ff M(int i7) {
        boolean z10 = this.f36556f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        if (z10 && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f32798r1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override
    public final int b() {
        int i7 = 0;
        this.f36555e = false;
        this.f36556f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        jm jmVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.f32843w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == jmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.f36555e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.f32818h1) {
            i7++;
        }
        if (z10 && this == jmVar) {
            i7++;
        }
        this.f36558r = i7;
        if (!z10) {
            i7 += ChatAttachAlertPhotoLayout.f32799s1.size();
            org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
            if (veVar != null) {
                i7 += veVar.f27357e.size();
            }
        }
        if (this.f36555e && i7 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f36556f = true;
            i7++;
        }
        if (this == jmVar) {
            i7++;
        }
        this.f36557n = i7;
        return i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        jm jmVar = chatAttachAlertPhotoLayout.H;
        if (chatAttachAlertPhotoLayout.f32843w0) {
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
            boolean z12 = this.f36556f;
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
            if (chatAttachAlertPhotoLayout.f32818h1 && i10 == 0) {
                return 4;
            }
            if (this == jmVar && i7 == this.f36557n - 1) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        if (this == chatAttachAlertPhotoLayout.H) {
            vy vyVar = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.f32843w0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            vyVar.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        ui uiVar = chatAttachAlertPhotoLayout.f37519b;
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
        boolean z15 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((k10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f32818h1);
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
        if (this.f36556f && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (z15 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.f32818h1) {
            i7--;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.f32837s.f59117o == 1) {
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
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
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
        if ((uiVar.f40367a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
            s5Var.b(ChatAttachAlertPhotoLayout.f32801u1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.f32845x0 && e02.f28059b) {
            s5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f32847y0 && !e02.f28059b) {
            s5Var.setAlpha(0.3f);
        } else {
            s5Var.setAlpha(1.0f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i7));
        s5Var.setTag(Integer.valueOf(i7));
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f36560w;
        ui uiVar = chatAttachAlertPhotoLayout.f37519b;
        org.telegram.ui.ActionBar.h6 h6Var = chatAttachAlertPhotoLayout.f37518a;
        if (i7 != 0) {
            Context context = this.f36554c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f31144a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i10 = org.telegram.ui.ActionBar.m6.f29327aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, mode);
                                    frameLayout.addView(imageView, c8.ma.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f31145b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.f29348ba, h6Var, mode);
                                    frameLayout.addView(imageView2, c8.ma.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f31146c = textView;
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29367ca, h6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.g0.L(80.0f);
                                    return new v4.f1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                                hi.e eVar = new hi.e(context, h6Var, true);
                                eVar.setUseWrapContent(true);
                                eVar.f();
                                eVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new nq(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.N0(2131750464, null));
                                eVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(eVar, c8.ma.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new v4.f1(frameLayout2);
                            }
                            k10 k10Var = new k10(context, uiVar.H3);
                            k10Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(400.0f)));
                            k10Var.setGravity(17);
                            k10Var.isClickable();
                            k10Var.f36744b.setOnClickListener(new o0(new sl(chatAttachAlertPhotoLayout, 5), 19));
                            k10Var.f36743a.setOnClickListener(new o0(new sl(chatAttachAlertPhotoLayout, 6), 20));
                            k10Var.f36745c.setOnClickListener(new m8(15, k10Var, new z2(this, 4)));
                            return new v4.f1(k10Var);
                        }
                        return new v4.f1(new View(context));
                    }
                    uiVar.getClass();
                    return new v4.f1(new im(this, context));
                }
                return new v4.f1(new bi.m3(15, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f31107a = org.telegram.messenger.g0.L(0.0f);
            return new v4.f1(view);
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
    public final void y(v4.f1 f1Var) {
        if (f1Var.f59165a instanceof org.telegram.ui.Cells.m5) {
            this.f36560w.R.i();
        }
    }
}
