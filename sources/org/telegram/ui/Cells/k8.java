package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.vs;
public final class k8 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView D;
    public final TextView E;
    public final kg.x0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int f22176a;
    public final ag.j3 f22177b;
    public final TextView f22178c;
    public final org.telegram.ui.Components.g9 d;
    public final ep e;
    public boolean f22179f;
    public final ImageView h;
    public final ImageView f22180n;
    public TLRPC.TL_messages_stickerSet f22181r;
    public boolean f22182s;
    public final Rect f22183w;
    public boolean f22184x;
    public final FrameLayout f22185y;

    public k8(Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        int i19;
        this.f22183w = new Rect();
        this.f22176a = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        boolean z10 = cd.X;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i20 = i11 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 13.0f;
        }
        if (z10) {
            f10 = 13.0f;
        } else {
            f10 = 0.0f;
        }
        addView(g9Var, w7.b6.d(40, 40.0f, i20, f7, 9.0f, f10, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                int i21 = org.telegram.ui.ActionBar.t6.Ji;
                y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i21, false), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i21);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
            }
            if (i10 == 1) {
                int i22 = org.telegram.ui.ActionBar.t6.Ii;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.a7.t(imageView, i22, null, mode);
                imageView.setImageResource(2131232040);
                imageView.setContentDescription(cd.L0(2131754839, null));
                if (cd.X) {
                    i19 = 3;
                } else {
                    i19 = 5;
                }
                addView(imageView, w7.b6.e(40, 40, i19 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f22180n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231628);
                org.telegram.ui.ActionBar.a7.t(imageView2, i22, null, mode);
                addView(imageView2, w7.b6.h(58.0f, 58.0f, 8388613));
                ep epVar = new ep(21, context, null);
                this.e = epVar;
                epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
                epVar.setDrawUnchecked(false);
                epVar.setDrawBackgroundAsArc(3);
                addView(epVar, w7.b6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231195);
                boolean z11 = cd.X;
                if (z11) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                int i23 = i17 | 48;
                if (z11) {
                    i18 = 10;
                } else {
                    i18 = 0;
                }
                addView(imageView, w7.b6.d(40, 40.0f, i23, i18, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f22185y = frameLayout;
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131754486, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        int i24 = org.telegram.ui.ActionBar.t6.Ci;
        int v02 = org.telegram.ui.ActionBar.t6.v0(i24);
        int i25 = org.telegram.ui.ActionBar.t6.Ei;
        y d = org.telegram.ui.ActionBar.j6.d(v02, org.telegram.ui.ActionBar.t6.v0(i25), 14.0f);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i24);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i25);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.a7.k(textView, d, N2, N3, null);
        textView.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new e8(this, 0));
        if (cd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView, w7.b6.h(-2.0f, 28.0f, i12 | 16));
        w7.e6.a(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(cd.L0(2131744873, null));
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Fi, null);
        y d10 = org.telegram.ui.ActionBar.j6.d(0, org.telegram.ui.ActionBar.t6.v0(i24) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i24, 26);
        textView2.setBackground(d10);
        org.telegram.ui.ActionBar.a7.k(textView2, d10, null, h, null);
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new e8(this, 0));
        if (cd.X) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(textView2, w7.b6.i(-2.0f, 32.0f, i13 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        w7.e6.a(textView2);
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(4.0f), context, null, false);
        this.F = x0Var;
        x0Var.setIcon(2131624312);
        x0Var.b(cd.L0(2131743901, null), new e8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
            int L = org.telegram.messenger.i0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
            x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f22185y;
        kg.x0 x0Var2 = this.F;
        if (cd.X) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        frameLayout2.addView(x0Var2, w7.b6.h(-2.0f, 28.0f, i14 | 16));
        w7.e6.a(this.F);
        this.f22185y.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        View view = this.f22185y;
        if (cd.X) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        addView(view, w7.b6.d(-2, -1.0f, i15, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f22185y.setOnClickListener(new e8(this, 1));
        ag.j3 j3Var = new ag.j3(context, 6);
        this.f22177b = j3Var;
        zs.i(j3Var);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, null);
        j3Var.setTextSize(1, 16.0f);
        j3Var.setTypeface(org.telegram.messenger.i0.o());
        j3Var.setLines(1);
        j3Var.setMaxLines(1);
        j3Var.setSingleLine(true);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        j3Var.setGravity(w7.b6.y());
        addView(j3Var, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f22178c = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21330z6, null);
        z20.o(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(w7.b6.y());
        addView(textView3, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(2131232095);
            imageView3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.f21311y6, null, PorterDuff.Mode.SRC_IN);
            int i26 = org.telegram.ui.ActionBar.t6.f21020i6;
            y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i26, false), 1, -1);
            org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i26);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.a7.k(imageView3, h03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z12 = cd.X;
            if (z12) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            int i27 = i16 | 16;
            if (z12) {
                f11 = 4.0f;
            } else {
                f11 = 0.0f;
            }
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 4.0f;
            }
            addView(imageView3, w7.b6.d(-2, -2.0f, i27, f11, 0.0f, f12, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.f22176a;
        if (i10 == 1) {
            return this.e.f25836a.f23919q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f22184x || this.f22185y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        int i10 = this.f22176a;
        if (i10 == 1) {
            this.e.a(z10, z11);
            return;
        }
        int i11 = 4;
        float f11 = 0.0f;
        float f12 = 0.1f;
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new h8(this, z10, 0));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f11);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!z10) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f22184x) {
            FrameLayout frameLayout = this.f22185y;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new h8(this, z10, 1));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX2.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            frameLayout.setVisibility(i11);
            if (!z10) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
                return;
            }
            frameLayout.setAlpha(1.0f);
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
        }
    }

    public final void c(final boolean z10) {
        float f7;
        float f10;
        if (this.f22176a == 1) {
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z10) {
                f11 = 1.0f;
            }
            float[] fArr = {f7, f11};
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.66f;
            }
            if (z10) {
                f12 = 0.66f;
            }
            float[] fArr2 = {f10, f12};
            ImageView imageView = this.f22180n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            gr grVar = vs.f31836a;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final k8 f21901b;

                {
                    this.f21901b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            k8 k8Var = this.f21901b;
                            if (!z11) {
                                k8Var.f22180n.setVisibility(8);
                                return;
                            } else {
                                k8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            k8 k8Var2 = this.f21901b;
                            if (z12) {
                                k8Var2.f22185y.setVisibility(8);
                                return;
                            } else {
                                k8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            k8 k8Var3 = this.f21901b;
                            if (z13) {
                                k8Var3.h.setVisibility(8);
                                return;
                            } else {
                                k8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f22184x) {
                FrameLayout frameLayout = this.f22185y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                    public final k8 f21901b;

                    {
                        this.f21901b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                k8 k8Var = this.f21901b;
                                if (!z11) {
                                    k8Var.f22180n.setVisibility(8);
                                    return;
                                } else {
                                    k8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                k8 k8Var2 = this.f21901b;
                                if (z12) {
                                    k8Var2.f22185y.setVisibility(8);
                                    return;
                                } else {
                                    k8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                k8 k8Var3 = this.f21901b;
                                if (z13) {
                                    k8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    k8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final k8 f21901b;

                {
                    this.f21901b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            k8 k8Var = this.f21901b;
                            if (!z11) {
                                k8Var.f22180n.setVisibility(8);
                                return;
                            } else {
                                k8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            k8 k8Var2 = this.f21901b;
                            if (z12) {
                                k8Var2.f22185y.setVisibility(8);
                                return;
                            } else {
                                k8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            k8 k8Var3 = this.f21901b;
                            if (z13) {
                                k8Var3.h.setVisibility(8);
                                return;
                            } else {
                                k8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        TLRPC.Document document;
        ic k10;
        int i11;
        String str2;
        this.f22179f = z10;
        this.f22181r = tL_messages_stickerSet;
        this.f22182s = z11;
        org.telegram.ui.Components.g9 g9Var = this.d;
        g9Var.setVisibility(0);
        ag.j3 j3Var = this.f22177b;
        j3Var.setTranslationY(0.0f);
        j3Var.setText(this.f22181r.set.title);
        boolean z12 = this.f22181r.set.archived;
        TextView textView = this.f22178c;
        if (z12) {
            j3Var.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            g9Var.setAlpha(0.5f);
        } else {
            j3Var.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            g9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f22184x = z13;
        int i12 = 8;
        if (z13) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f22185y.setVisibility(i10);
        if (!this.f22184x) {
            i12 = 0;
        }
        this.h.setVisibility(i12);
        g9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f22184x) {
                str3 = "EmojiCount";
            }
            textView.setText(cd.G(arrayList.size(), str3, new Object[0]));
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    document = arrayList.get(i13);
                    if (document != null && document.f19799id == tL_messages_stickerSet.set.thumb_document_id) {
                        break;
                    }
                    i13++;
                } else {
                    document = null;
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            sc.e(1);
            TLObject w9 = org.telegram.messenger.b8.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w9 == null) {
                w9 = document2;
            }
            c00 d = org.telegram.messenger.v5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.t6.f20872a7, 1.0f, false);
            boolean z14 = w9 instanceof TLRPC.Document;
            if (z14) {
                k10 = ic.c(org.telegram.messenger.b8.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k10 = ic.k((TLRPC.PhotoSize) w9, document2, tL_messages_stickerSet.set.thumb_version);
            }
            ic icVar = k10;
            if (this.f22184x) {
                i11 = 16388;
            } else {
                i11 = 1;
            }
            if (!sc.e(i11)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!jj.K2(document2, true) && !jj.N4(document2))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (icVar != null && icVar.f16109p == 1) {
                    g9Var.k(icVar, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    g9Var.k(icVar, concat, "webp", d, tL_messages_stickerSet2);
                }
            } else {
                if (d != null) {
                    g9Var.p(ic.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    g9Var.l(ic.b(document2), concat, icVar, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (jj.C4(document2)) {
                    g9Var.setColorFilter(org.telegram.ui.ActionBar.t6.f21256v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(cd.G(0, str3, new Object[0]));
            g9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.f5.g(d20.f15147s0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.c5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        org.telegram.messenger.i0.g3(new ea(7, k8.this, document3));
                    }
                });
            }
        }
        if (this.f22182s) {
            StringBuilder sb2 = new StringBuilder();
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            sb2.append(str);
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        int i13 = 0;
        kg.x0 x0Var = this.F;
        if (i10 == 1) {
            x0Var.b(cd.L0(2131743901, null), new e8(this, 0), false);
        } else if (i10 == 2) {
            x0Var.b(cd.L0(2131746099, null), new e8(this, 0), false);
        }
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        x0Var.setEnabled(z10);
        if (i10 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.D;
        textView.setEnabled(z11);
        if (i10 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.E;
        textView2.setEnabled(z12);
        float f16 = 0.0f;
        float f17 = 1.0f;
        if (i10 != 1 && i10 != 2) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        x0Var.setAlpha(f7);
        if (i10 != 1 && i10 != 2) {
            f10 = 0.6f;
        } else {
            f10 = 1.0f;
        }
        x0Var.setScaleX(f10);
        if (i10 != 1 && i10 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        x0Var.setScaleY(f11);
        if (i10 != 1 && i10 != 2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        x0Var.setVisibility(i11);
        if (i10 == 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        textView.setAlpha(f12);
        if (i10 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        textView.setScaleX(f13);
        if (i10 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleY(f14);
        if (i10 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 4) {
            f16 = 1.0f;
        }
        textView2.setAlpha(f16);
        if (i10 == 4) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView2.setScaleX(f15);
        if (i10 != 4) {
            f17 = 0.6f;
        }
        textView2.setScaleY(f17);
        if (i10 != 4) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824);
        FrameLayout frameLayout = this.f22185y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.i0.L(26.0f);
        boolean z13 = cd.X;
        TextView textView3 = this.f22178c;
        ag.j3 j3Var = this.f22177b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) j3Var.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) j3Var.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f22181r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.f22179f) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(71.0f);
            }
            float f7 = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ep epVar = this.e;
        if (epVar != null && epVar.f25836a.f23919q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f) + (this.f22179f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.f22183w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f22184x && (frameLayout = this.f22185y) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i10;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (onClickListener == null) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f22179f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f22180n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override
    public final void updateColors() {
    }
}
