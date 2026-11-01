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
public final class bm extends bk0 {
    public final Context f24887c;
    public final boolean d;
    public boolean e;
    public boolean f24888f;
    public final ArrayList h = new ArrayList(8);
    public int f24889n;
    public int f24890r;
    public boolean f24891s;
    public final ChatAttachAlertPhotoLayout f24892w;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.f24892w = chatAttachAlertPhotoLayout;
        this.f24887c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(uk0 uk0Var) {
        org.telegram.messenger.xe xeVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f23847r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        if ((!isEmpty || ((xeVar = chatAttachAlertPhotoLayout.T0) != null && !xeVar.e.isEmpty())) && chatAttachAlertPhotoLayout.f30964b.I1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList;
        org.telegram.messenger.ff M = M(i10);
        if (M == null) {
            int i11 = this.f24890r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23847r1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.ff) arrayList2.get(0);
                } else {
                    org.telegram.messenger.xe xeVar = chatAttachAlertPhotoLayout.T0;
                    if (xeVar != null && (arrayList = xeVar.e) != null) {
                        M = (org.telegram.messenger.ff) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.e.isEmpty()) {
                M = (org.telegram.messenger.ff) i0.a.g(1, chatAttachAlertPhotoLayout.T0.e);
            }
        }
        if (M != null) {
            long j10 = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j10 /= 1000;
            }
            return org.telegram.messenger.dd.e0(j10, true);
        }
        return "";
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (uk0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = uk0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(uk0 uk0Var) {
        int i10 = this.f24892w.M0;
        int ceil = (int) Math.ceil(this.f24889n / i10);
        if (uk0Var.getChildCount() != 0) {
            int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
            View childAt = uk0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (uk0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(uk0 uk0Var) {
        this.f24891s = false;
        int childCount = uk0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            uk0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f24891s = true;
    }

    public final dk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(this.f24887c, chatAttachAlertPhotoLayout.f30963a);
        if (this == chatAttachAlertPhotoLayout.G) {
            v5Var.setOutlineProvider(new org.telegram.ui.ol(this, 2));
            v5Var.setClipToOutline(true);
        }
        v5Var.setFastScrollDelegate(new t(this, 22));
        v5Var.setDelegate(new f2(9, this, v5Var));
        return new s4.c1(v5Var);
    }

    public final org.telegram.messenger.ff M(int i10) {
        boolean z10 = this.f24888f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
        return chatAttachAlertPhotoLayout.c0(i10);
    }

    @Override
    public final int b() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        bm bmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f23889v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f24888f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == bmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f23864g1) {
            i10++;
        }
        if (z10 && this == bmVar) {
            i10++;
        }
        this.f24890r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f23847r1.size();
            org.telegram.messenger.xe xeVar = chatAttachAlertPhotoLayout.T0;
            if (xeVar != null) {
                i10 += xeVar.e.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f24888f = true;
            i10++;
        }
        if (this == bmVar) {
            i10++;
        }
        this.f24889n = i10;
        return i10;
    }

    @Override
    public final int d(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        bm bmVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f23889v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == bmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                if (!chatAttachAlertPhotoLayout.O0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f24888f;
            if (z12 && i10 == chatAttachAlertPhotoLayout.M0) {
                return 5;
            }
            if (z12 && i10 > chatAttachAlertPhotoLayout.M0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z11) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f23864g1 && i11 == 0) {
                return 4;
            }
            if (this == bmVar && i10 == this.f24889n - 1) {
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
        int i10;
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        if (this == chatAttachAlertPhotoLayout.G) {
            xy xyVar = chatAttachAlertPhotoLayout.H;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f23889v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xyVar.setVisibility(i10);
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((m10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f23864g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                q5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                if (!z15 || !chatAttachAlertPhotoLayout.O0 || i10 != 0) {
                    i12 = 1;
                }
                q5Var.setType(i12);
                return;
            }
            ((org.telegram.ui.Cells.p5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f24888f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f23864g1) {
            i10--;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            v5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f23885s.f47879o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v5Var.setIsVertical(z10);
        }
        if (biVar.K2 == 0 && !biVar.N2 && !biVar.f24835y1) {
            v5Var.getCheckBox().setVisibility(0);
        } else {
            v5Var.getCheckBox().setVisibility(8);
        }
        org.telegram.messenger.ff c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 == null) {
            return;
        }
        int i13 = c02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23848s1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 == b() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (biVar != null && biVar.Z1) {
            z14 = true;
        } else {
            z14 = false;
        }
        v5Var.d(c02, z11, z12, z13, z14);
        if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
            v5Var.b(ChatAttachAlertPhotoLayout.f23849t1.indexOf(Integer.valueOf(i13)), hashMap.containsKey(Integer.valueOf(i13)), false);
        } else {
            v5Var.b(-1, hashMap.containsKey(Integer.valueOf(i13)), false);
        }
        if (!chatAttachAlertPhotoLayout.f23891w0 && c02.f14603b) {
            v5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f23893x0 && !c02.f14603b) {
            v5Var.setAlpha(0.3f);
        } else {
            v5Var.setAlpha(1.0f);
        }
        v5Var.getImageView().setTag(Integer.valueOf(i10));
        v5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24892w;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        org.telegram.ui.ActionBar.p6 p6Var = chatAttachAlertPhotoLayout.f30963a;
        if (i10 != 0) {
            Context context = this.f24887c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f22832a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i11 = org.telegram.ui.ActionBar.t6.f20876aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, mode);
                                    frameLayout.addView(imageView, w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f22833b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.f20896ba, p6Var, mode);
                                    frameLayout.addView(imageView2, w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f22834c = textView;
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20915ca, p6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.i0.L(80.0f);
                                    return new s4.c1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                                vh.d dVar = new vh.d(context, p6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(org.telegram.messenger.i0.L(28.0f), 0, org.telegram.messenger.i0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new dq(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.dd.L0(2131750490, null));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.b6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s4.c1(frameLayout2);
                            }
                            m10 m10Var = new m10(context, biVar.D3);
                            m10Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(400.0f)));
                            m10Var.setGravity(17);
                            m10Var.isClickable();
                            m10Var.f28321b.setOnClickListener(new h0(new hl(chatAttachAlertPhotoLayout, 5), 16));
                            m10Var.f28320a.setOnClickListener(new h0(new hl(chatAttachAlertPhotoLayout, 6), 17));
                            m10Var.f28322c.setOnClickListener(new sr(6, m10Var, new r2(this, 2)));
                            return new s4.c1(m10Var);
                        }
                        return new s4.c1(new View(context));
                    }
                    biVar.getClass();
                    return new s4.c1(new am(this, context));
                }
                return new s4.c1(new bi.t0(this, context, 9));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f22456a = org.telegram.messenger.i0.L(0.0f);
            return new s4.c1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            dk0 dk0Var = (dk0) arrayList.get(0);
            arrayList.remove(0);
            return dk0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.c1 c1Var) {
        if (c1Var.f47909a instanceof org.telegram.ui.Cells.p5) {
            this.f24892w.Q.i();
        }
    }
}
