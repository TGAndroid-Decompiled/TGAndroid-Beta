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
public final class hm extends kj0 {
    public final Context f35765c;
    public final boolean d;
    public boolean f35766e;
    public boolean f35767f;
    public final ArrayList h = new ArrayList(8);
    public int f35768n;
    public int f35769r;
    public boolean f35770s;
    public final ChatAttachAlertPhotoLayout f35771w;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.f35771w = chatAttachAlertPhotoLayout;
        this.f35765c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final boolean E(ek0 ek0Var) {
        org.telegram.messenger.ue ueVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f32863s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        if ((!isEmpty || ((ueVar = chatAttachAlertPhotoLayout.U0) != null && !ueVar.f27262e.isEmpty())) && chatAttachAlertPhotoLayout.f37135b.M1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.ef M = M(i7);
        if (M == null) {
            int i10 = this.f35769r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32863s1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.ef) arrayList2.get(0);
                } else {
                    org.telegram.messenger.ue ueVar = chatAttachAlertPhotoLayout.U0;
                    if (ueVar != null && (arrayList = ueVar.f27262e) != null) {
                        M = (org.telegram.messenger.ef) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.f27262e.isEmpty()) {
                M = (org.telegram.messenger.ef) i5.c.h(1, chatAttachAlertPhotoLayout.U0.f27262e);
            }
        }
        if (M != null) {
            long j3 = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j3 /= 1000;
            }
            return org.telegram.messenger.gd.e0(j3, true);
        }
        return "";
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
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
        int i7 = this.f35771w.N0;
        int ceil = (int) Math.ceil(this.f35768n / i7);
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
        this.f35770s = false;
        int childCount = ek0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ek0Var.getChildAt(i7).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f35770s = true;
    }

    public final mj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(this.f35765c, chatAttachAlertPhotoLayout.f37134a);
        if (this == chatAttachAlertPhotoLayout.H) {
            r5Var.setOutlineProvider(new fh.a(this, 3));
            r5Var.setClipToOutline(true);
        }
        r5Var.setFastScrollDelegate(new b0(this, 21));
        r5Var.setDelegate(new g2(11, this, r5Var));
        return new v4.f1(r5Var);
    }

    public final org.telegram.messenger.ef M(int i7) {
        boolean z10 = this.f35767f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        if (z10 && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override
    public final int b() {
        int i7 = 0;
        this.f35766e = false;
        this.f35767f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.f32907w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == hmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.f35766e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.f32882h1) {
            i7++;
        }
        if (z10 && this == hmVar) {
            i7++;
        }
        this.f35769r = i7;
        if (!z10) {
            i7 += ChatAttachAlertPhotoLayout.f32863s1.size();
            org.telegram.messenger.ue ueVar = chatAttachAlertPhotoLayout.U0;
            if (ueVar != null) {
                i7 += ueVar.f27262e.size();
            }
        }
        if (this.f35766e && i7 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f35767f = true;
            i7++;
        }
        if (this == hmVar) {
            i7++;
        }
        this.f35768n = i7;
        return i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        if (chatAttachAlertPhotoLayout.f32907w0) {
            boolean z10 = chatAttachAlertPhotoLayout.Q0;
            if (z10 && this == hmVar) {
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
            boolean z12 = this.f35767f;
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
            if (chatAttachAlertPhotoLayout.f32882h1 && i10 == 0) {
                return 4;
            }
            if (this == hmVar && i7 == this.f35768n - 1) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        if (this == chatAttachAlertPhotoLayout.H) {
            sy syVar = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.f32907w0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            syVar.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z15 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((i10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f32882h1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                if (!z15 || !chatAttachAlertPhotoLayout.P0 || i7 != 0) {
                    i11 = 1;
                }
                m5Var.setType(i11);
                return;
            }
            ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.L0);
            return;
        }
        if (this.f35767f && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (z15 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.f32882h1) {
            i7--;
        }
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            r5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.f32901s.f59199o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r5Var.setIsVertical(z10);
        }
        if (tiVar.O2 == 0 && !tiVar.R2 && !tiVar.C1) {
            r5Var.getCheckBox().setVisibility(0);
        } else {
            r5Var.getCheckBox().setVisibility(8);
        }
        org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i12 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
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
        if (tiVar != null && tiVar.d2) {
            z14 = true;
        } else {
            z14 = false;
        }
        r5Var.d(e02, z11, z12, z13, z14);
        if ((tiVar.f39956a2 instanceof org.telegram.ui.bn) && tiVar.R3) {
            r5Var.b(ChatAttachAlertPhotoLayout.f32865u1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            r5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.f32909x0 && e02.f27963b) {
            r5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f32911y0 && !e02.f27963b) {
            r5Var.setAlpha(0.3f);
        } else {
            r5Var.setAlpha(1.0f);
        }
        r5Var.getImageView().setTag(Integer.valueOf(i7));
        r5Var.setTag(Integer.valueOf(i7));
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35771w;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        org.telegram.ui.ActionBar.i6 i6Var = chatAttachAlertPhotoLayout.f37134a;
        if (i7 != 0) {
            Context context = this.f35765c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f31152a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i10 = org.telegram.ui.ActionBar.n6.f29397aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, mode);
                                    frameLayout.addView(imageView, c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f31153b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.f29418ba, i6Var, mode);
                                    frameLayout.addView(imageView2, c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f31154c = textView;
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29437ca, i6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, c8.na.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.g0.L(80.0f);
                                    return new v4.f1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                                hi.e eVar = new hi.e(context, i6Var, true);
                                eVar.setUseWrapContent(true);
                                eVar.f();
                                eVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new kq(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.N0(2131750464, null));
                                eVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(eVar, c8.na.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new v4.f1(frameLayout2);
                            }
                            i10 i10Var = new i10(context, tiVar.H3);
                            i10Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(400.0f)));
                            i10Var.setGravity(17);
                            i10Var.isClickable();
                            i10Var.f35864b.setOnClickListener(new n0(new ql(chatAttachAlertPhotoLayout, 5), 19));
                            i10Var.f35863a.setOnClickListener(new n0(new ql(chatAttachAlertPhotoLayout, 6), 20));
                            i10Var.f35865c.setOnClickListener(new l8(15, i10Var, new y2(this, 4)));
                            return new v4.f1(i10Var);
                        }
                        return new v4.f1(new View(context));
                    }
                    tiVar.getClass();
                    return new v4.f1(new gm(this, context));
                }
                return new v4.f1(new bi.o3(15, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f31087a = org.telegram.messenger.g0.L(0.0f);
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
        if (f1Var.f59245a instanceof org.telegram.ui.Cells.l5) {
            this.f35771w.R.i();
        }
    }
}
