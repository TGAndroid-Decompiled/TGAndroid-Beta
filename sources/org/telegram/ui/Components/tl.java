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
public final class tl extends vi0 {
    public final Context f38380c;
    public final boolean d;
    public boolean f38381e;
    public boolean f38382f;
    public final ArrayList h = new ArrayList(8);
    public int f38383n;
    public int f38384r;
    public boolean f38385s;
    public final ChatAttachAlertPhotoLayout f38386w;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z9) {
        this.f38386w = chatAttachAlertPhotoLayout;
        this.f38380c = context;
        this.d = z9;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(pj0 pj0Var) {
        org.telegram.messenger.we weVar;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f31189r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        if ((!isEmpty || ((weVar = chatAttachAlertPhotoLayout.T0) != null && !weVar.f26300e.isEmpty())) && chatAttachAlertPhotoLayout.f39004b.I1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        org.telegram.messenger.gf M = M(i7);
        if (M == null) {
            int i10 = this.f38384r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
            if (i7 <= i10) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31189r1;
                if (!arrayList2.isEmpty()) {
                    M = (org.telegram.messenger.gf) arrayList2.get(0);
                } else {
                    org.telegram.messenger.we weVar = chatAttachAlertPhotoLayout.T0;
                    if (weVar != null && (arrayList = weVar.f26300e) != null) {
                        M = (org.telegram.messenger.gf) arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.f26300e.isEmpty()) {
                M = (org.telegram.messenger.gf) jg.g.i(1, chatAttachAlertPhotoLayout.T0.f26300e);
            }
        }
        if (M != null) {
            long j3 = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j3 /= 1000;
            }
            return org.telegram.messenger.id.e0(j3, true);
        }
        return "";
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (pj0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (ceil / f11)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = pj0Var.getPaddingTop() + ((int) (ceil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(pj0 pj0Var) {
        int i7 = this.f38386w.M0;
        int ceil = (int) Math.ceil(this.f38383n / i7);
        if (pj0Var.getChildCount() != 0) {
            int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = pj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / i7) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (pj0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(pj0 pj0Var) {
        this.f38385s = false;
        int childCount = pj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            pj0Var.getChildAt(i7).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f38385s = true;
    }

    public final xi0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.f38380c, chatAttachAlertPhotoLayout.f39003a);
        if (this == chatAttachAlertPhotoLayout.G) {
            q5Var.setOutlineProvider(new fh.a(this, 3));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new u(this, 22));
        q5Var.setDelegate(new f2(8, this, q5Var));
        return new v4.d1(q5Var);
    }

    public final org.telegram.messenger.gf M(int i7) {
        boolean z9 = this.f38382f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        if (z9 && i7 > chatAttachAlertPhotoLayout.M0) {
            i7--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i7--;
        }
        boolean z10 = ChatAttachAlertPhotoLayout.f31188q1;
        return chatAttachAlertPhotoLayout.e0(i7);
    }

    @Override
    public final int b() {
        int i7 = 0;
        this.f38381e = false;
        this.f38382f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        tl tlVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f31230v0) {
            return 1;
        }
        boolean z9 = chatAttachAlertPhotoLayout.P0;
        if (z9 && this == tlVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.f38381e = true;
            i7 = 1;
        }
        if (chatAttachAlertPhotoLayout.f31206g1) {
            i7++;
        }
        if (z9 && this == tlVar) {
            i7++;
        }
        this.f38384r = i7;
        if (!z9) {
            i7 += ChatAttachAlertPhotoLayout.f31189r1.size();
            org.telegram.messenger.we weVar = chatAttachAlertPhotoLayout.T0;
            if (weVar != null) {
                i7 += weVar.f26300e.size();
            }
        }
        if (this.f38381e && i7 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f38382f = true;
            i7++;
        }
        if (this == tlVar) {
            i7++;
        }
        this.f38383n = i7;
        return i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        tl tlVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f31230v0) {
            boolean z9 = chatAttachAlertPhotoLayout.P0;
            if (z9 && this == tlVar) {
                if (i7 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z10 = this.d;
            if (z10 && i7 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                if (!chatAttachAlertPhotoLayout.O0) {
                    return 1;
                }
                return 8;
            }
            boolean z11 = this.f38382f;
            if (z11 && i7 == chatAttachAlertPhotoLayout.M0) {
                return 5;
            }
            if (z11 && i7 > chatAttachAlertPhotoLayout.M0) {
                i10 = i7 - 1;
            } else {
                i10 = i7;
            }
            if (z10) {
                i10--;
            }
            if (chatAttachAlertPhotoLayout.f31206g1 && i10 == 0) {
                return 4;
            }
            if (this == tlVar && i7 == this.f38383n - 1) {
                return 2;
            }
            if (z9) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        if (this == chatAttachAlertPhotoLayout.G) {
            jy jyVar = chatAttachAlertPhotoLayout.H;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f31230v0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            jyVar.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        di diVar = chatAttachAlertPhotoLayout.f39004b;
        int i10 = d1Var.f57048f;
        View view = d1Var.f57044a;
        boolean z14 = this.d;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 == 7) {
                        ((x00) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f31206g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                l5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                if (!z14 || !chatAttachAlertPhotoLayout.O0 || i7 != 0) {
                    i11 = 1;
                }
                l5Var.setType(i11);
                return;
            }
            ((org.telegram.ui.Cells.k5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f38382f && i7 > chatAttachAlertPhotoLayout.M0) {
            i7--;
        }
        if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i7--;
        }
        if (chatAttachAlertPhotoLayout.f31206g1) {
            i7--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f31226s.f57013o == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            q5Var.setIsVertical(z9);
        }
        if (diVar.K2 == 0 && !diVar.N2 && !diVar.f33015y1) {
            q5Var.getCheckBox().setVisibility(0);
        } else {
            q5Var.getCheckBox().setVisibility(8);
        }
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 == null) {
            return;
        }
        int i12 = e02.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f31190s1;
        if (hashMap.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i7 == b() - 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (diVar != null && diVar.Z1) {
            z13 = true;
        } else {
            z13 = false;
        }
        q5Var.d(e02, z10, z11, z12, z13);
        if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
            q5Var.b(ChatAttachAlertPhotoLayout.f31191t1.indexOf(Integer.valueOf(i12)), hashMap.containsKey(Integer.valueOf(i12)), false);
        } else {
            q5Var.b(-1, hashMap.containsKey(Integer.valueOf(i12)), false);
        }
        if (!chatAttachAlertPhotoLayout.f31232w0 && e02.f26845b) {
            q5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f31234x0 && !e02.f26845b) {
            q5Var.setAlpha(0.3f);
        } else {
            q5Var.setAlpha(1.0f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i7));
        q5Var.setTag(Integer.valueOf(i7));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38386w;
        di diVar = chatAttachAlertPhotoLayout.f39004b;
        org.telegram.ui.ActionBar.f6 f6Var = chatAttachAlertPhotoLayout.f39003a;
        if (i7 != 0) {
            Context context = this.f38380c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f29514a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i10 = org.telegram.ui.ActionBar.k6.f27799aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, mode);
                                    frameLayout.addView(imageView, c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f29515b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f27819ba, f6Var, mode);
                                    frameLayout.addView(imageView2, c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f29516c = textView;
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27838ca, f6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = org.telegram.messenger.g0.L(80.0f);
                                    return new v4.d1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                                fi.d dVar = new fi.d(context, f6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new wp(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.id.M0(2131750482, null));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, c8.ha.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new v4.d1(frameLayout2);
                            }
                            x00 x00Var = new x00(context, diVar.D3);
                            x00Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(400.0f)));
                            x00Var.setGravity(17);
                            x00Var.isClickable();
                            x00Var.f40152b.setOnClickListener(new h0(new cl(chatAttachAlertPhotoLayout, 5), 17));
                            x00Var.f40151a.setOnClickListener(new h0(new cl(chatAttachAlertPhotoLayout, 6), 18));
                            x00Var.f40153c.setOnClickListener(new lk(13, x00Var, new s2(this, 2)));
                            return new v4.d1(x00Var);
                        }
                        return new v4.d1(new View(context));
                    }
                    diVar.getClass();
                    return new v4.d1(new sl(this, context));
                }
                return new v4.d1(new bi.ec(14, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f29431a = org.telegram.messenger.g0.L(0.0f);
            return new v4.d1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            xi0 xi0Var = (xi0) arrayList.get(0);
            arrayList.remove(0);
            return xi0Var;
        }
        return L();
    }

    @Override
    public final void y(v4.d1 d1Var) {
        if (d1Var.f57044a instanceof org.telegram.ui.Cells.k5) {
            this.f38386w.Q.i();
        }
    }
}
