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
public final class am extends aj0 {
    public final Context f33014c;
    public final boolean d;
    public boolean f33015e;
    public boolean f33016f;
    public final ArrayList h = new ArrayList(8);
    public int f33017n;
    public int f33018r;
    public boolean f33019s;
    public final ChatAttachAlertPhotoLayout f33020w;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.f33020w = chatAttachAlertPhotoLayout;
        this.f33014c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final boolean E(uj0 uj0Var) {
        org.telegram.messenger.ve veVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f32366s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        if ((!isEmpty || ((veVar = chatAttachAlertPhotoLayout.U0) != null && !veVar.f26971e.isEmpty())) && chatAttachAlertPhotoLayout.f33607b.M1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.ff M = M(i7);
        if (M == null) {
            int i10 = this.f33018r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32366s1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.ff) arrayList2.get(0);
                } else {
                    org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
                    if (veVar != null && (arrayList = veVar.f26971e) != null) {
                        M = (org.telegram.messenger.ff) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.f26971e.isEmpty()) {
                M = (org.telegram.messenger.ff) i5.c.h(1, chatAttachAlertPhotoLayout.U0.f26971e);
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
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (uj0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = uj0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(uj0 uj0Var) {
        int i7 = this.f33020w.N0;
        int ceil = (int) Math.ceil(this.f33017n / i7);
        if (uj0Var.getChildCount() != 0) {
            int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = uj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / i7) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (uj0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(uj0 uj0Var) {
        this.f33019s = false;
        int childCount = uj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            uj0Var.getChildAt(i7).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f33019s = true;
    }

    public final cj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.f33014c, chatAttachAlertPhotoLayout.f33606a);
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setOutlineProvider(new fh.a(this, 3));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new s(this, 22));
        q5Var.setDelegate(new f1(12, this, q5Var));
        return new v4.e1(q5Var);
    }

    public final org.telegram.messenger.ff M(int i7) {
        boolean z10 = this.f33016f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        if (z10 && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override
    public final int b() {
        int i7 = 0;
        this.f33015e = false;
        this.f33016f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        am amVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.f32410w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == amVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.f33015e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.f32385h1) {
            i7++;
        }
        if (z10 && this == amVar) {
            i7++;
        }
        this.f33018r = i7;
        if (!z10) {
            i7 += ChatAttachAlertPhotoLayout.f32366s1.size();
            org.telegram.messenger.ve veVar = chatAttachAlertPhotoLayout.U0;
            if (veVar != null) {
                i7 += veVar.f26971e.size();
            }
        }
        if (this.f33015e && i7 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f33016f = true;
            i7++;
        }
        if (this == amVar) {
            i7++;
        }
        this.f33017n = i7;
        return i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        am amVar = chatAttachAlertPhotoLayout.H;
        if (chatAttachAlertPhotoLayout.f32410w0) {
            boolean z10 = chatAttachAlertPhotoLayout.Q0;
            if (z10 && this == amVar) {
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
            boolean z12 = this.f33016f;
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
            if (chatAttachAlertPhotoLayout.f32385h1 && i10 == 0) {
                return 4;
            }
            if (this == amVar && i7 == this.f33017n - 1) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        if (this == chatAttachAlertPhotoLayout.H) {
            ny nyVar = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.f32410w0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            nyVar.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        ki kiVar = chatAttachAlertPhotoLayout.f33607b;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z15 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((a10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f32385h1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                if (!z15 || !chatAttachAlertPhotoLayout.P0 || i7 != 0) {
                    i11 = 1;
                }
                l5Var.setType(i11);
                return;
            }
            ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.L0);
            return;
        }
        if (this.f33016f && i7 > chatAttachAlertPhotoLayout.N0) {
            i7--;
        }
        if (z15 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.f32385h1) {
            i7--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.f32404s.f58489o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            q5Var.setIsVertical(z10);
        }
        if (kiVar.O2 == 0 && !kiVar.R2 && !kiVar.C1) {
            q5Var.getCheckBox().setVisibility(0);
        } else {
            q5Var.getCheckBox().setVisibility(8);
        }
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i12 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
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
        if (kiVar != null && kiVar.d2) {
            z14 = true;
        } else {
            z14 = false;
        }
        q5Var.d(e02, z11, z12, z13, z14);
        if ((kiVar.f36436a2 instanceof org.telegram.ui.an) && kiVar.R3) {
            q5Var.b(ChatAttachAlertPhotoLayout.f32368u1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            q5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.f32412x0 && e02.f27708b) {
            q5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f32414y0 && !e02.f27708b) {
            q5Var.setAlpha(0.3f);
        } else {
            q5Var.setAlpha(1.0f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i7));
        q5Var.setTag(Integer.valueOf(i7));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33020w;
        ki kiVar = chatAttachAlertPhotoLayout.f33607b;
        org.telegram.ui.ActionBar.e6 e6Var = chatAttachAlertPhotoLayout.f33606a;
        if (i7 != 0) {
            Context context = this.f33014c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f30632a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i10 = org.telegram.ui.ActionBar.j6.f28795aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, mode);
                                    frameLayout.addView(imageView, c8.ja.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f30633b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.f28816ba, e6Var, mode);
                                    frameLayout.addView(imageView2, c8.ja.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f30634c = textView;
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28835ca, e6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.g0.L(80.0f);
                                    return new v4.e1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                                hi.d dVar = new hi.d(context, e6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new eq(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131750481, null));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, c8.ja.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new v4.e1(frameLayout2);
                            }
                            a10 a10Var = new a10(context, kiVar.H3);
                            a10Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(400.0f)));
                            a10Var.setGravity(17);
                            a10Var.isClickable();
                            a10Var.f32817b.setOnClickListener(new e0(new jl(chatAttachAlertPhotoLayout, 5), 18));
                            a10Var.f32816a.setOnClickListener(new e0(new jl(chatAttachAlertPhotoLayout, 6), 19));
                            a10Var.f32818c.setOnClickListener(new n2(20, a10Var, new q2(this, 4)));
                            return new v4.e1(a10Var);
                        }
                        return new v4.e1(new View(context));
                    }
                    kiVar.getClass();
                    return new v4.e1(new zl(this, context));
                }
                return new v4.e1(new bi.o2(15, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f30566a = org.telegram.messenger.g0.L(0.0f);
            return new v4.e1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            cj0 cj0Var = (cj0) arrayList.get(0);
            arrayList.remove(0);
            return cj0Var;
        }
        return L();
    }

    @Override
    public final void y(v4.e1 e1Var) {
        if (e1Var.f58535a instanceof org.telegram.ui.Cells.k5) {
            this.f33020w.R.i();
        }
    }
}
