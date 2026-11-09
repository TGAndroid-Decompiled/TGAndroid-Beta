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
import bi.md;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public final class g8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView D;
    public final TextView E;
    public final ug.p0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int f29205a;
    public final md f29206b;
    public final TextView f29207c;
    public final org.telegram.ui.Components.l9 d;
    public final wo f29208e;
    public boolean f29209f;
    public final ImageView h;
    public final ImageView f29210n;
    public TLRPC.TL_messages_stickerSet f29211r;
    public boolean f29212s;
    public final Rect f29213w;
    public boolean f29214x;
    public final FrameLayout f29215y;

    public g8(Context context, int i7) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        int i18;
        this.f29213w = new Rect();
        this.f29205a = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        boolean z9 = id.f23157a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i19 = i10 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 13.0f;
        }
        if (z9) {
            f11 = 13.0f;
        } else {
            f11 = 0.0f;
        }
        addView(l9Var, c8.ha.d(40, 40.0f, i19, f10, 9.0f, f11, 0.0f));
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i7 != 3) {
                int i20 = org.telegram.ui.ActionBar.l6.Ji;
                y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i20, false), 1, -1);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i20);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, null);
            }
            if (i7 == 1) {
                int i21 = org.telegram.ui.ActionBar.l6.Ii;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.s6.s(imageView, i21, null, mode);
                imageView.setImageResource(2131232041);
                imageView.setContentDescription(id.M0(2131754839, null));
                if (id.f23157a0) {
                    i18 = 3;
                } else {
                    i18 = 5;
                }
                addView(imageView, c8.ha.e(40, 40, i18 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f29210n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231627);
                org.telegram.ui.ActionBar.s6.s(imageView2, i21, null, mode);
                addView(imageView2, c8.ha.h(58.0f, 58.0f, 8388613));
                wo woVar = new wo(21, context, null);
                this.f29208e = woVar;
                woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
                woVar.setDrawUnchecked(false);
                woVar.setDrawBackgroundAsArc(3);
                addView(woVar, c8.ha.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i7 == 3) {
                org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231195);
                boolean z10 = id.f23157a0;
                if (z10) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                int i22 = i16 | 48;
                if (z10) {
                    i17 = 10;
                } else {
                    i17 = 0;
                }
                addView(imageView, c8.ha.d(40, 40.0f, i22, i17, 9.0f, z10 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f29215y = frameLayout;
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(id.M0(2131754486, null));
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
        int i23 = org.telegram.ui.ActionBar.l6.Ci;
        int v02 = org.telegram.ui.ActionBar.l6.v0(i23);
        int i24 = org.telegram.ui.ActionBar.l6.Ei;
        y d = org.telegram.ui.ActionBar.a6.d(v02, org.telegram.ui.ActionBar.l6.v0(i24), 14.0f);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i23);
        org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i24);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.s6.j(textView, d, M2, M3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new a8(this, 0));
        if (id.f23157a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(textView, c8.ha.h(-2.0f, 28.0f, i11 | 16));
        c8.ka.a(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131744855, null));
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.Fi, null);
        y d2 = org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.l6.v0(i23) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i23, 26);
        textView2.setBackground(d2);
        org.telegram.ui.ActionBar.s6.j(textView2, d2, null, g10, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new a8(this, 0));
        if (id.f23157a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView2, c8.ha.i(-2.0f, 32.0f, i12 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        c8.ka.a(textView2);
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.F = p0Var;
        p0Var.setIcon(2131624314);
        p0Var.b(id.M0(2131743876, null), new a8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f29215y;
        ug.p0 p0Var2 = this.F;
        if (id.f23157a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout2.addView(p0Var2, c8.ha.h(-2.0f, 28.0f, i13 | 16));
        c8.ka.a(this.F);
        this.f29215y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        View view = this.f29215y;
        if (id.f23157a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(view, c8.ha.d(-2, -1.0f, i14, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29215y.setOnClickListener(new a8(this, 1));
        md mdVar = new md(context, 9);
        this.f29206b = mdVar;
        qs.i(mdVar);
        org.telegram.ui.ActionBar.s6.U(mdVar, org.telegram.ui.ActionBar.l6.G6, null);
        mdVar.setTextSize(1, 16.0f);
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setLines(1);
        mdVar.setMaxLines(1);
        mdVar.setSingleLine(true);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setGravity(c8.ha.y());
        addView(mdVar, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f29207c = textView3;
        org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f28275z6, null);
        org.telegram.messenger.camera.q.n(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(c8.ha.y());
        addView(textView3, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i7 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(2131232096);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.s6.s(imageView3, org.telegram.ui.ActionBar.l6.f28257y6, null, PorterDuff.Mode.SRC_IN);
            int i25 = org.telegram.ui.ActionBar.l6.f27957i6;
            y h03 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i25, false), 1, -1);
            org.telegram.ui.ActionBar.o6 M4 = org.telegram.ui.ActionBar.s6.M(i25);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.s6.j(imageView3, h03, null, M4, null);
            imageView3.setVisibility(8);
            boolean z11 = id.f23157a0;
            if (z11) {
                i15 = 3;
            } else {
                i15 = 5;
            }
            int i26 = i15 | 16;
            if (z11) {
                f12 = 4.0f;
            } else {
                f12 = 0.0f;
            }
            if (z11) {
                f13 = 0.0f;
            } else {
                f13 = 4.0f;
            }
            addView(imageView3, c8.ha.d(-2, -2.0f, i26, f12, 0.0f, f13, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i7 = this.f29205a;
        if (i7 == 1) {
            return this.f29208e.f40108a.f31268q;
        }
        if (i7 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f29214x || this.f29215y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        float f11;
        int i7 = this.f29205a;
        if (i7 == 1) {
            this.f29208e.a(z9, z10);
            return;
        }
        int i10 = 4;
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (i7 == 3) {
            ImageView imageView = this.h;
            if (z10) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new d8(this, z9, 0));
                if (z9) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f12);
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z9) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z9) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            if (!z9) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f29214x) {
            FrameLayout frameLayout = this.f29215y;
            if (z10) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new d8(this, z9, 1));
                if (z9) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f12);
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f10);
                if (z9) {
                    f13 = 1.0f;
                }
                scaleX2.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z9) {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            if (!z9) {
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

    public final void c(final boolean z9) {
        float f10;
        float f11;
        if (this.f29205a == 1) {
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z9) {
                f12 = 1.0f;
            }
            float[] fArr = {f10, f12};
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.66f;
            }
            if (z9) {
                f13 = 0.66f;
            }
            float[] fArr2 = {f11, f13};
            ImageView imageView = this.f29210n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            xq xqVar = ks.f35466a;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final g8 f28944b;

                {
                    this.f28944b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z10 = z9;
                            g8 g8Var = this.f28944b;
                            if (!z10) {
                                g8Var.f29210n.setVisibility(8);
                                return;
                            } else {
                                g8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z11 = z9;
                            g8 g8Var2 = this.f28944b;
                            if (z11) {
                                g8Var2.f29215y.setVisibility(8);
                                return;
                            } else {
                                g8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z12 = z9;
                            g8 g8Var3 = this.f28944b;
                            if (z12) {
                                g8Var3.h.setVisibility(8);
                                return;
                            } else {
                                g8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f29214x) {
                FrameLayout frameLayout = this.f29215y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                    public final g8 f28944b;

                    {
                        this.f28944b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = z9;
                                g8 g8Var = this.f28944b;
                                if (!z10) {
                                    g8Var.f29210n.setVisibility(8);
                                    return;
                                } else {
                                    g8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z11 = z9;
                                g8 g8Var2 = this.f28944b;
                                if (z11) {
                                    g8Var2.f29215y.setVisibility(8);
                                    return;
                                } else {
                                    g8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z12 = z9;
                                g8 g8Var3 = this.f28944b;
                                if (z12) {
                                    g8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    g8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final g8 f28944b;

                {
                    this.f28944b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z10 = z9;
                            g8 g8Var = this.f28944b;
                            if (!z10) {
                                g8Var.f29210n.setVisibility(8);
                                return;
                            } else {
                                g8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z11 = z9;
                            g8 g8Var2 = this.f28944b;
                            if (z11) {
                                g8Var2.f29215y.setVisibility(8);
                                return;
                            } else {
                                g8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z12 = z9;
                            g8 g8Var3 = this.f28944b;
                            if (z12) {
                                g8Var3.h.setVisibility(8);
                                return;
                            } else {
                                g8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9, boolean z10) {
        int i7;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        TLRPC.Document document;
        hc k10;
        int i10;
        String str2;
        this.f29209f = z9;
        this.f29211r = tL_messages_stickerSet;
        this.f29212s = z10;
        org.telegram.ui.Components.l9 l9Var = this.d;
        l9Var.setVisibility(0);
        md mdVar = this.f29206b;
        mdVar.setTranslationY(0.0f);
        mdVar.setText(this.f29211r.set.title);
        boolean z11 = this.f29211r.set.archived;
        TextView textView = this.f29207c;
        if (z11) {
            mdVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            l9Var.setAlpha(0.5f);
        } else {
            mdVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            l9Var.setAlpha(1.0f);
        }
        boolean z12 = tL_messages_stickerSet.set.emojis;
        this.f29214x = z12;
        int i11 = 8;
        if (z12) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f29215y.setVisibility(i7);
        if (!this.f29214x) {
            i11 = 0;
        }
        this.h.setVisibility(i11);
        l9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f29214x) {
                str3 = "EmojiCount";
            }
            textView.setText(id.G(arrayList.size(), str3, new Object[0]));
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    document = arrayList.get(i12);
                    if (document != null && document.f26962id == tL_messages_stickerSet.set.thumb_document_id) {
                        break;
                    }
                    i12++;
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
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            rz d = org.telegram.messenger.t5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, false);
            boolean z13 = w10 instanceof TLRPC.Document;
            if (z13) {
                k10 = hc.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k10 = hc.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            }
            hc hcVar = k10;
            if (this.f29214x) {
                i10 = 16388;
            } else {
                i10 = 1;
            }
            if (!sc.e(i10)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z13 || (!ij.K2(document2, true) && !ij.N4(document2))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (hcVar != null && hcVar.f22878p == 1) {
                    l9Var.k(hcVar, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    l9Var.k(hcVar, concat, "webp", d, tL_messages_stickerSet2);
                }
            } else {
                if (d != null) {
                    l9Var.p(hc.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    l9Var.l(hc.b(document2), concat, hcVar, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (ij.C4(document2)) {
                    l9Var.setColorFilter(org.telegram.ui.ActionBar.l6.f28197v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(id.G(0, str3, new Object[0]));
            l9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.i5.g(p10.f24470s0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.f5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        org.telegram.messenger.g0.h3(new ea(7, g8.this, document3));
                    }
                });
            }
        }
        if (this.f29212s) {
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

    public final void e(int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        int i12 = 0;
        ug.p0 p0Var = this.F;
        if (i7 == 1) {
            p0Var.b(id.M0(2131743876, null), new a8(this, 0), false);
        } else if (i7 == 2) {
            p0Var.b(id.M0(2131746082, null), new a8(this, 0), false);
        }
        if (i7 != 1 && i7 != 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        p0Var.setEnabled(z9);
        if (i7 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView textView = this.D;
        textView.setEnabled(z10);
        if (i7 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView2 = this.E;
        textView2.setEnabled(z11);
        float f17 = 0.0f;
        float f18 = 1.0f;
        if (i7 != 1 && i7 != 2) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        p0Var.setAlpha(f10);
        if (i7 != 1 && i7 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        p0Var.setScaleX(f11);
        if (i7 != 1 && i7 != 2) {
            f12 = 0.6f;
        } else {
            f12 = 1.0f;
        }
        p0Var.setScaleY(f12);
        if (i7 != 1 && i7 != 2) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        p0Var.setVisibility(i10);
        if (i7 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        textView.setAlpha(f13);
        if (i7 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleX(f14);
        if (i7 == 3) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView.setScaleY(f15);
        if (i7 == 3) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (i7 == 4) {
            f17 = 1.0f;
        }
        textView2.setAlpha(f17);
        if (i7 == 4) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView2.setScaleX(f16);
        if (i7 != 4) {
            f18 = 0.6f;
        }
        textView2.setScaleY(f18);
        if (i7 != 4) {
            i12 = 8;
        }
        textView2.setVisibility(i12);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824);
        FrameLayout frameLayout = this.f29215y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.g0.L(26.0f);
        boolean z12 = id.f23157a0;
        TextView textView3 = this.f29207c;
        md mdVar = this.f29206b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f29211r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f29209f) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, height, width - i7, getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.f29208e;
        if (woVar != null && woVar.f40108a.f31268q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f) + (this.f29209f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.f29213w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f29214x && (frameLayout = this.f29215y) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z9) {
        b(z9, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i7;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (onClickListener == null) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            imageView.setVisibility(i7);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z9) {
        this.f29209f = z9;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f29210n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z9) {
        c(z9);
    }

    @Override
    public final void updateColors() {
    }
}
