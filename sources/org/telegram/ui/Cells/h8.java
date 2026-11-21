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
import di.xb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.zs;
public final class h8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView E;
    public final TextView F;
    public final ug.r0 G;
    public final ImageView H;
    public AnimatorSet I;
    public final int f30786a;
    public final xb f30787b;
    public final TextView f30788c;
    public final org.telegram.ui.Components.q9 d;
    public final op f30789e;
    public boolean f30790f;
    public final ImageView h;
    public final ImageView f30791n;
    public TLRPC.TL_messages_stickerSet f30792r;
    public boolean f30793s;
    public final Rect f30794w;
    public boolean f30795x;
    public final FrameLayout f30796y;

    public h8(Context context, int i7) {
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
        this.f30794w = new Rect();
        this.f30786a = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        boolean z10 = gd.f24241a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i19 = i10 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 13.0f;
        }
        if (z10) {
            f11 = 13.0f;
        } else {
            f11 = 0.0f;
        }
        addView(q9Var, c8.ma.d(40, 40.0f, i19, f10, 9.0f, f11, 0.0f));
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i7 != 3) {
                int i20 = org.telegram.ui.ActionBar.m6.Mi;
                y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i20, false), 1, -1);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i20);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
            }
            if (i7 == 1) {
                int i21 = org.telegram.ui.ActionBar.m6.Li;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.t6.s(imageView, i21, null, mode);
                imageView.setImageResource(2131232043);
                imageView.setContentDescription(gd.N0(2131754838, null));
                if (gd.f24241a0) {
                    i18 = 3;
                } else {
                    i18 = 5;
                }
                addView(imageView, c8.ma.e(40, 40, i18 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f30791n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231628);
                org.telegram.ui.ActionBar.t6.s(imageView2, i21, null, mode);
                addView(imageView2, c8.ma.h(58.0f, 58.0f, 8388613));
                op opVar = new op(21, context, null);
                this.f30789e = opVar;
                opVar.b(-1, org.telegram.ui.ActionBar.m6.f29378d6, org.telegram.ui.ActionBar.m6.f29508k7);
                opVar.setDrawUnchecked(false);
                opVar.setDrawBackgroundAsArc(3);
                addView(opVar, c8.ma.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i7 == 3) {
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231195);
                boolean z11 = gd.f24241a0;
                if (z11) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                int i22 = i16 | 48;
                if (z11) {
                    i17 = 10;
                } else {
                    i17 = 0;
                }
                addView(imageView, c8.ma.d(40, 40.0f, i22, i17, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f30796y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131754483, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
        int i23 = org.telegram.ui.ActionBar.m6.Fi;
        int v02 = org.telegram.ui.ActionBar.m6.v0(i23);
        int i24 = org.telegram.ui.ActionBar.m6.Hi;
        y d = org.telegram.ui.ActionBar.a6.d(v02, org.telegram.ui.ActionBar.m6.v0(i24), 14.0f);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i23);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i24);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.t6.j(textView, d, M2, M3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new b8(this, 0));
        if (gd.f24241a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(textView, c8.ma.h(-2.0f, 28.0f, i11 | 16));
        c8.ra.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.N0(2131744614, null));
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Ii, null);
        y d2 = org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.m6.v0(i23) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i23, 26);
        textView2.setBackground(d2);
        org.telegram.ui.ActionBar.t6.j(textView2, d2, null, g10, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new b8(this, 0));
        if (gd.f24241a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView2, c8.ma.i(-2.0f, 32.0f, i12 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        c8.ra.a(textView2);
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.G = r0Var;
        r0Var.setIcon(2131624315);
        r0Var.b(gd.N0(2131743633, null), new b8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            r0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f30796y;
        ug.r0 r0Var2 = this.G;
        if (gd.f24241a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout2.addView(r0Var2, c8.ma.h(-2.0f, 28.0f, i13 | 16));
        c8.ra.a(this.G);
        this.f30796y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        View view = this.f30796y;
        if (gd.f24241a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(view, c8.ma.d(-2, -1.0f, i14, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f30796y.setOnClickListener(new b8(this, 1));
        xb xbVar = new xb(context, 9);
        this.f30787b = xbVar;
        ks.i(xbVar);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.G6, null);
        xbVar.setTextSize(1, 16.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setLines(1);
        xbVar.setMaxLines(1);
        xbVar.setSingleLine(true);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setGravity(c8.ma.y());
        addView(xbVar, c8.ma.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f30788c = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29789z6, null);
        n10.q(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(c8.ma.y());
        addView(textView3, c8.ma.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i7 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(2131232098);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.f29770y6, null, PorterDuff.Mode.SRC_IN);
            int i25 = org.telegram.ui.ActionBar.m6.f29470i6;
            y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i25, false), 1, -1);
            org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i25);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.t6.j(imageView3, h03, null, M4, null);
            imageView3.setVisibility(8);
            boolean z12 = gd.f24241a0;
            if (z12) {
                i15 = 3;
            } else {
                i15 = 5;
            }
            int i26 = i15 | 16;
            if (z12) {
                f12 = 4.0f;
            } else {
                f12 = 0.0f;
            }
            if (z12) {
                f13 = 0.0f;
            } else {
                f13 = 4.0f;
            }
            addView(imageView3, c8.ma.d(-2, -2.0f, i26, f12, 0.0f, f13, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i7 = this.f30786a;
        if (i7 == 1) {
            return this.f30789e.f38327a.f32871q;
        }
        if (i7 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f30795x || this.f30796y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29543m6));
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        int i7 = this.f30786a;
        if (i7 == 1) {
            this.f30789e.a(z10, z11);
            return;
        }
        int i10 = 4;
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (i7 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new e8(this, z10, 0));
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f12);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z10) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            if (!z10) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f30795x) {
            FrameLayout frameLayout = this.f30796y;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new e8(this, z10, 1));
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f12);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f10);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX2.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z10) {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
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
        float f10;
        float f11;
        if (this.f30786a == 1) {
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z10) {
                f12 = 1.0f;
            }
            float[] fArr = {f10, f12};
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.66f;
            }
            if (z10) {
                f13 = 0.66f;
            }
            float[] fArr2 = {f11, f13};
            ImageView imageView = this.f30791n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            nr nrVar = zs.f42971a;
            duration.setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final h8 f30510b;

                {
                    this.f30510b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            h8 h8Var = this.f30510b;
                            if (!z11) {
                                h8Var.f30791n.setVisibility(8);
                                return;
                            } else {
                                h8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            h8 h8Var2 = this.f30510b;
                            if (z12) {
                                h8Var2.f30796y.setVisibility(8);
                                return;
                            } else {
                                h8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            h8 h8Var3 = this.f30510b;
                            if (z13) {
                                h8Var3.h.setVisibility(8);
                                return;
                            } else {
                                h8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f30795x) {
                FrameLayout frameLayout = this.f30796y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(nrVar).withEndAction(new Runnable(this) {
                    public final h8 f30510b;

                    {
                        this.f30510b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                h8 h8Var = this.f30510b;
                                if (!z11) {
                                    h8Var.f30791n.setVisibility(8);
                                    return;
                                } else {
                                    h8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                h8 h8Var2 = this.f30510b;
                                if (z12) {
                                    h8Var2.f30796y.setVisibility(8);
                                    return;
                                } else {
                                    h8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                h8 h8Var3 = this.f30510b;
                                if (z13) {
                                    h8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    h8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final h8 f30510b;

                {
                    this.f30510b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            h8 h8Var = this.f30510b;
                            if (!z11) {
                                h8Var.f30791n.setVisibility(8);
                                return;
                            } else {
                                h8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            h8 h8Var2 = this.f30510b;
                            if (z12) {
                                h8Var2.f30796y.setVisibility(8);
                                return;
                            } else {
                                h8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            h8 h8Var3 = this.f30510b;
                            if (z13) {
                                h8Var3.h.setVisibility(8);
                                return;
                            } else {
                                h8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        int i7;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        TLRPC.Document document;
        fc k10;
        int i10;
        String str2;
        this.f30790f = z10;
        this.f30792r = tL_messages_stickerSet;
        this.f30793s = z11;
        org.telegram.ui.Components.q9 q9Var = this.d;
        q9Var.setVisibility(0);
        xb xbVar = this.f30787b;
        xbVar.setTranslationY(0.0f);
        xbVar.setText(this.f30792r.set.title);
        boolean z12 = this.f30792r.set.archived;
        TextView textView = this.f30788c;
        if (z12) {
            xbVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            q9Var.setAlpha(0.5f);
        } else {
            xbVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            q9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f30795x = z13;
        int i11 = 8;
        if (z13) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f30796y.setVisibility(i7);
        if (!this.f30795x) {
            i11 = 0;
        }
        this.h.setVisibility(i11);
        q9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f30795x) {
                str3 = "EmojiCount";
            }
            textView.setText(gd.G(arrayList.size(), str3, new Object[0]));
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    document = arrayList.get(i12);
                    if (document != null && document.f28437id == tL_messages_stickerSet.set.thumb_document_id) {
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
            pc.e(1);
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            lz d = org.telegram.messenger.u5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.m6.f29321a7, 1.0f, false);
            boolean z14 = w10 instanceof TLRPC.Document;
            if (z14) {
                k10 = fc.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k10 = fc.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            }
            fc fcVar = k10;
            if (this.f30795x) {
                i10 = 16388;
            } else {
                i10 = 1;
            }
            if (!pc.e(i10)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!fj.K2(document2, true) && !fj.N4(document2))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (fcVar != null && fcVar.f23905p == 1) {
                    q9Var.k(fcVar, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    q9Var.k(fcVar, concat, "webp", d, tL_messages_stickerSet2);
                }
            } else {
                if (d != null) {
                    q9Var.p(fc.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    q9Var.l(fc.b(document2), concat, fcVar, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (fj.C4(document2)) {
                    q9Var.setColorFilter(org.telegram.ui.ActionBar.m6.f29710v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(gd.G(0, str3, new Object[0]));
            q9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.p5.g(j10.f24798t0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.m5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        org.telegram.messenger.g0.g3(new ga(7, h8.this, document3));
                    }
                });
            }
        }
        if (this.f30793s) {
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
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I = null;
        }
        int i12 = 0;
        ug.r0 r0Var = this.G;
        if (i7 == 1) {
            r0Var.b(gd.N0(2131743633, null), new b8(this, 0), false);
        } else if (i7 == 2) {
            r0Var.b(gd.N0(2131745886, null), new b8(this, 0), false);
        }
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        r0Var.setEnabled(z10);
        if (i7 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.E;
        textView.setEnabled(z11);
        if (i7 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.F;
        textView2.setEnabled(z12);
        float f17 = 0.0f;
        float f18 = 1.0f;
        if (i7 != 1 && i7 != 2) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        r0Var.setAlpha(f10);
        if (i7 != 1 && i7 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        r0Var.setScaleX(f11);
        if (i7 != 1 && i7 != 2) {
            f12 = 0.6f;
        } else {
            f12 = 1.0f;
        }
        r0Var.setScaleY(f12);
        if (i7 != 1 && i7 != 2) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        r0Var.setVisibility(i10);
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
        FrameLayout frameLayout = this.f30796y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.g0.L(26.0f);
        boolean z13 = gd.f24241a0;
        TextView textView3 = this.f30788c;
        xb xbVar = this.f30787b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) xbVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) xbVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f30792r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f30790f) {
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, height, width - i7, getHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        op opVar = this.f30789e;
        if (opVar != null && opVar.f38327a.f32871q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f) + (this.f30790f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.f30794w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f30795x && (frameLayout = this.f30796y) != null) {
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
        int i7;
        ImageView imageView = this.H;
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

    public void setNeedDivider(boolean z10) {
        this.f30790f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f30791n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override
    public final void updateColors() {
    }
}
