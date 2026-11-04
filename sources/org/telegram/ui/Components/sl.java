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
public final class sl extends zi0 {
    public final Context f38049c;
    public final boolean d;
    public boolean f38050e;
    public boolean f38051f;
    public final ArrayList h = new ArrayList(8);
    public int f38052n;
    public int f38053r;
    public boolean f38054s;
    public final ChatAttachAlertPhotoLayout f38055w;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.f38055w = chatAttachAlertPhotoLayout;
        this.f38049c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(tj0 tj0Var) {
        org.telegram.messenger.pe peVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f31259s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        if ((!isEmpty || ((peVar = chatAttachAlertPhotoLayout.U0) != null && !peVar.f24738e.isEmpty())) && chatAttachAlertPhotoLayout.f38416b.J1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i3) {
        ArrayList arrayList;
        org.telegram.messenger.ye M = M(i3);
        if (M == null) {
            int i10 = this.f38053r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
            if (i3 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31259s1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.ye) arrayList2.get(0);
                } else {
                    org.telegram.messenger.pe peVar = chatAttachAlertPhotoLayout.U0;
                    if (peVar != null && (arrayList = peVar.f24738e) != null) {
                        M = (org.telegram.messenger.ye) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.f24738e.isEmpty()) {
                M = (org.telegram.messenger.ye) k2.p1.h(1, chatAttachAlertPhotoLayout.U0.f24738e);
            }
        }
        if (M != null) {
            long j10 = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j10 /= 1000;
            }
            return org.telegram.messenger.bd.e0(j10, true);
        }
        return "";
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (tj0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = tj0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(tj0 tj0Var) {
        int i3 = this.f38055w.N0;
        int ceil = (int) Math.ceil(this.f38052n / i3);
        if (tj0Var.getChildCount() != 0) {
            int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = tj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / i3) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (tj0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(tj0 tj0Var) {
        this.f38054s = false;
        int childCount = tj0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            tj0Var.getChildAt(i3).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f38054s = true;
    }

    public final bj0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.f38049c, chatAttachAlertPhotoLayout.f38415a);
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setOutlineProvider(new gh.a(this, 3));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new t(this, 22));
        q5Var.setDelegate(new org.telegram.ui.jo(18, this, q5Var));
        return new u4.d1(q5Var);
    }

    public final org.telegram.messenger.ye M(int i3) {
        boolean z10 = this.f38051f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        if (z10 && i3 > chatAttachAlertPhotoLayout.N0) {
            i3--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i3--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
        return chatAttachAlertPhotoLayout.e0(i3);
    }

    @Override
    public final int b() {
        int i3 = 0;
        this.f38050e = false;
        this.f38051f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        sl slVar = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.f31303w0) {
            return 1;
        }
        boolean z10 = chatAttachAlertPhotoLayout.Q0;
        if (z10 && this == slVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.f38050e = true;
            i3 = 1;
        }
        if (chatAttachAlertPhotoLayout.f31278h1) {
            i3++;
        }
        if (z10 && this == slVar) {
            i3++;
        }
        this.f38053r = i3;
        if (!z10) {
            i3 += ChatAttachAlertPhotoLayout.f31259s1.size();
            org.telegram.messenger.pe peVar = chatAttachAlertPhotoLayout.U0;
            if (peVar != null) {
                i3 += peVar.f24738e.size();
            }
        }
        if (this.f38050e && i3 > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f38051f = true;
            i3++;
        }
        if (this == slVar) {
            i3++;
        }
        this.f38052n = i3;
        return i3;
    }

    @Override
    public final int d(int i3) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        sl slVar = chatAttachAlertPhotoLayout.H;
        if (chatAttachAlertPhotoLayout.f31303w0) {
            boolean z10 = chatAttachAlertPhotoLayout.Q0;
            if (z10 && this == slVar) {
                if (i3 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i3 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                if (!chatAttachAlertPhotoLayout.P0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f38051f;
            if (z12 && i3 == chatAttachAlertPhotoLayout.N0) {
                return 5;
            }
            if (z12 && i3 > chatAttachAlertPhotoLayout.N0) {
                i10 = i3 - 1;
            } else {
                i10 = i3;
            }
            if (z11) {
                i10--;
            }
            if (chatAttachAlertPhotoLayout.f31278h1 && i10 == 0) {
                return 4;
            }
            if (this == slVar && i3 == this.f38052n - 1) {
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
        int i3;
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        if (this == chatAttachAlertPhotoLayout.H) {
            gy gyVar = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.f31303w0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            gyVar.setVisibility(i3);
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z15 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((s00) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f31278h1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                if (!z15 || !chatAttachAlertPhotoLayout.P0 || i3 != 0) {
                    i11 = 1;
                }
                l5Var.setType(i11);
                return;
            }
            ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.L0);
            return;
        }
        if (this.f38051f && i3 > chatAttachAlertPhotoLayout.N0) {
            i3--;
        }
        if (z15 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i3--;
        }
        if (chatAttachAlertPhotoLayout.f31278h1) {
            i3--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.f31297s.f55509o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            q5Var.setIsVertical(z10);
        }
        if (biVar.L2 == 0 && !biVar.O2 && !biVar.f32298z1) {
            q5Var.getCheckBox().setVisibility(0);
        } else {
            q5Var.getCheckBox().setVisibility(8);
        }
        org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
        if (e02 == null) {
            return;
        }
        int i12 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
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
        if (i3 == b() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (biVar != null && biVar.f32212a2) {
            z14 = true;
        } else {
            z14 = false;
        }
        q5Var.d(e02, z11, z12, z13, z14);
        if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
            q5Var.b(ChatAttachAlertPhotoLayout.f31261u1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            q5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.f31305x0 && e02.f25310b) {
            q5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f31307y0 && !e02.f25310b) {
            q5Var.setAlpha(0.3f);
        } else {
            q5Var.setAlpha(1.0f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i3));
        q5Var.setTag(Integer.valueOf(i3));
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38055w;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        org.telegram.ui.ActionBar.e6 e6Var = chatAttachAlertPhotoLayout.f38415a;
        if (i3 != 0) {
            Context context = this.f38049c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 7) {
                                if (i3 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f29571a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i10 = org.telegram.ui.ActionBar.k6.f27827aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, mode);
                                    frameLayout.addView(imageView, b8.mf.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f29572b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f27846ba, e6Var, mode);
                                    frameLayout.addView(imageView2, b8.mf.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f29573c = textView;
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27865ca, e6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.g0.L(80.0f);
                                    return new u4.d1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                                gi.d dVar = new gi.d(context, e6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new wp(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131750489, null));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, b8.mf.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new u4.d1(frameLayout2);
                            }
                            s00 s00Var = new s00(context, biVar.E3);
                            s00Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(400.0f)));
                            s00Var.setGravity(17);
                            s00Var.isClickable();
                            s00Var.f37874b.setOnClickListener(new f0(new al(chatAttachAlertPhotoLayout, 5), 17));
                            s00Var.f37873a.setOnClickListener(new f0(new al(chatAttachAlertPhotoLayout, 6), 18));
                            s00Var.f37875c.setOnClickListener(new q2(19, s00Var, new p2(this, 2)));
                            return new u4.d1(s00Var);
                        }
                        return new u4.d1(new View(context));
                    }
                    biVar.getClass();
                    return new u4.d1(new rl(this, context));
                }
                return new u4.d1(new ai.x2(15, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f29505a = org.telegram.messenger.g0.L(0.0f);
            return new u4.d1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            bj0 bj0Var = (bj0) arrayList.get(0);
            arrayList.remove(0);
            return bj0Var;
        }
        return L();
    }

    @Override
    public final void y(u4.d1 d1Var) {
        if (d1Var.f55540a instanceof org.telegram.ui.Cells.k5) {
            this.f38055w.R.i();
        }
    }
}
