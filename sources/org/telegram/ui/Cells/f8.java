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
import di.ub;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.qs;
public final class f8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView E;
    public final TextView F;
    public final ug.q0 G;
    public final ImageView H;
    public AnimatorSet I;
    public final int f30294a;
    public final ub f30295b;
    public final TextView f30296c;
    public final org.telegram.ui.Components.i9 d;
    public final fp f30297e;
    public boolean f30298f;
    public final ImageView h;
    public final ImageView f30299n;
    public TLRPC.TL_messages_stickerSet f30300r;
    public boolean f30301s;
    public final Rect f30302w;
    public boolean f30303x;
    public final FrameLayout f30304y;

    public f8(Context context, int i7) {
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
        this.f30302w = new Rect();
        this.f30294a = i7;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.setAspectFit(true);
        i9Var.setLayerNum(1);
        boolean z10 = hd.f24101a0;
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
        addView(i9Var, c8.ja.d(40, 40.0f, i19, f10, 9.0f, f11, 0.0f));
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i7 != 3) {
                int i20 = org.telegram.ui.ActionBar.j6.Mi;
                y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i20, false), 1, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i20);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
            }
            if (i7 == 1) {
                int i21 = org.telegram.ui.ActionBar.j6.Li;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.q6.s(imageView, i21, null, mode);
                imageView.setImageResource(2131232042);
                imageView.setContentDescription(hd.M0(2131754839, null));
                if (hd.f24101a0) {
                    i18 = 3;
                } else {
                    i18 = 5;
                }
                addView(imageView, c8.ja.e(40, 40, i18 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f30299n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231627);
                org.telegram.ui.ActionBar.q6.s(imageView2, i21, null, mode);
                addView(imageView2, c8.ja.h(58.0f, 58.0f, 8388613));
                fp fpVar = new fp(21, context, null);
                this.f30297e = fpVar;
                fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
                fpVar.setDrawUnchecked(false);
                fpVar.setDrawBackgroundAsArc(3);
                addView(fpVar, c8.ja.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i7 == 3) {
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231195);
                boolean z11 = hd.f24101a0;
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
                addView(imageView, c8.ja.d(40, 40.0f, i22, i17, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f30304y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131754486, null));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        int i23 = org.telegram.ui.ActionBar.j6.Fi;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i23);
        int i24 = org.telegram.ui.ActionBar.j6.Hi;
        y d = org.telegram.ui.ActionBar.y5.d(v02, org.telegram.ui.ActionBar.j6.v0(i24), 14.0f);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i23);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i24);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.q6.j(textView, d, M2, M3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new z7(this, 0));
        if (hd.f24101a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(textView, c8.ja.h(-2.0f, 28.0f, i11 | 16));
        c8.na.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.M0(2131744855, null));
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ii, null);
        y d2 = org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.j6.v0(i23) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i23, 26);
        textView2.setBackground(d2);
        org.telegram.ui.ActionBar.q6.j(textView2, d2, null, g10, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new z7(this, 0));
        if (hd.f24101a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView2, c8.ja.i(-2.0f, 32.0f, i12 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        c8.na.a(textView2);
        ug.q0 q0Var = new ug.q0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.G = q0Var;
        q0Var.setIcon(2131624315);
        q0Var.b(hd.M0(2131743876, null), new z7(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            q0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f30304y;
        ug.q0 q0Var2 = this.G;
        if (hd.f24101a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout2.addView(q0Var2, c8.ja.h(-2.0f, 28.0f, i13 | 16));
        c8.na.a(this.G);
        this.f30304y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        View view = this.f30304y;
        if (hd.f24101a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(view, c8.ja.d(-2, -1.0f, i14, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f30304y.setOnClickListener(new z7(this, 1));
        ub ubVar = new ub(context, 9);
        this.f30295b = ubVar;
        ns.i(ubVar);
        org.telegram.ui.ActionBar.q6.U(ubVar, org.telegram.ui.ActionBar.j6.G6, null);
        ubVar.setTextSize(1, 16.0f);
        ubVar.setTypeface(org.telegram.messenger.g0.o());
        ubVar.setLines(1);
        ubVar.setMaxLines(1);
        ubVar.setSingleLine(true);
        ubVar.setEllipsize(TextUtils.TruncateAt.END);
        ubVar.setGravity(c8.ja.y());
        addView(ubVar, c8.ja.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f30296c = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29260z6, null);
        i20.p(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(c8.ja.y());
        addView(textView3, c8.ja.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i7 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(2131232097);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.f29241y6, null, PorterDuff.Mode.SRC_IN);
            int i25 = org.telegram.ui.ActionBar.j6.f28941i6;
            y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i25, false), 1, -1);
            org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i25);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.q6.j(imageView3, h03, null, M4, null);
            imageView3.setVisibility(8);
            boolean z12 = hd.f24101a0;
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
            addView(imageView3, c8.ja.d(-2, -2.0f, i26, f12, 0.0f, f13, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i7 = this.f30294a;
        if (i7 == 1) {
            return this.f30297e.f34663a.f32441q;
        }
        if (i7 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f30303x || this.f30304y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        int i7 = this.f30294a;
        if (i7 == 1) {
            this.f30297e.a(z10, z11);
            return;
        }
        int i10 = 4;
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (i7 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new c8(this, z10, 0));
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
        } else if (this.f30303x) {
            FrameLayout frameLayout = this.f30304y;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new c8(this, z10, 1));
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
        if (this.f30294a == 1) {
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
            ImageView imageView = this.f30299n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            er erVar = qs.f38756a;
            duration.setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final f8 f30010b;

                {
                    this.f30010b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            f8 f8Var = this.f30010b;
                            if (!z11) {
                                f8Var.f30299n.setVisibility(8);
                                return;
                            } else {
                                f8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            f8 f8Var2 = this.f30010b;
                            if (z12) {
                                f8Var2.f30304y.setVisibility(8);
                                return;
                            } else {
                                f8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            f8 f8Var3 = this.f30010b;
                            if (z13) {
                                f8Var3.h.setVisibility(8);
                                return;
                            } else {
                                f8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f30303x) {
                FrameLayout frameLayout = this.f30304y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(erVar).withEndAction(new Runnable(this) {
                    public final f8 f30010b;

                    {
                        this.f30010b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                f8 f8Var = this.f30010b;
                                if (!z11) {
                                    f8Var.f30299n.setVisibility(8);
                                    return;
                                } else {
                                    f8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                f8 f8Var2 = this.f30010b;
                                if (z12) {
                                    f8Var2.f30304y.setVisibility(8);
                                    return;
                                } else {
                                    f8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                f8 f8Var3 = this.f30010b;
                                if (z13) {
                                    f8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    f8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final f8 f30010b;

                {
                    this.f30010b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            f8 f8Var = this.f30010b;
                            if (!z11) {
                                f8Var.f30299n.setVisibility(8);
                                return;
                            } else {
                                f8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            f8 f8Var2 = this.f30010b;
                            if (z12) {
                                f8Var2.f30304y.setVisibility(8);
                                return;
                            } else {
                                f8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            f8 f8Var3 = this.f30010b;
                            if (z13) {
                                f8Var3.h.setVisibility(8);
                                return;
                            } else {
                                f8Var3.getClass();
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
        gc k10;
        int i10;
        String str2;
        this.f30298f = z10;
        this.f30300r = tL_messages_stickerSet;
        this.f30301s = z11;
        org.telegram.ui.Components.i9 i9Var = this.d;
        i9Var.setVisibility(0);
        ub ubVar = this.f30295b;
        ubVar.setTranslationY(0.0f);
        ubVar.setText(this.f30300r.set.title);
        boolean z12 = this.f30300r.set.archived;
        TextView textView = this.f30296c;
        if (z12) {
            ubVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            i9Var.setAlpha(0.5f);
        } else {
            ubVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            i9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f30303x = z13;
        int i11 = 8;
        if (z13) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f30304y.setVisibility(i7);
        if (!this.f30303x) {
            i11 = 0;
        }
        this.h.setVisibility(i11);
        i9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f30303x) {
                str3 = "EmojiCount";
            }
            textView.setText(hd.G(arrayList.size(), str3, new Object[0]));
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    document = arrayList.get(i12);
                    if (document != null && document.f28057id == tL_messages_stickerSet.set.thumb_document_id) {
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
            qc.e(1);
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            pz d = org.telegram.messenger.t5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.j6.f28792a7, 1.0f, false);
            boolean z14 = w10 instanceof TLRPC.Document;
            if (z14) {
                k10 = gc.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k10 = gc.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            }
            gc gcVar = k10;
            if (this.f30303x) {
                i10 = 16388;
            } else {
                i10 = 1;
            }
            if (!qc.e(i10)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!gj.K2(document2, true) && !gj.N4(document2))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (gcVar != null && gcVar.f23724p == 1) {
                    i9Var.k(gcVar, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    i9Var.k(gcVar, concat, "webp", d, tL_messages_stickerSet2);
                }
            } else {
                if (d != null) {
                    i9Var.p(gc.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    i9Var.l(gc.b(document2), concat, gcVar, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (gj.C4(document2)) {
                    i9Var.setColorFilter(org.telegram.ui.ActionBar.j6.f29181v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(hd.G(0, str3, new Object[0]));
            i9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.g5.g(m10.f24934t0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.d5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        org.telegram.messenger.g0.h3(new ea(7, f8.this, document3));
                    }
                });
            }
        }
        if (this.f30301s) {
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
        ug.q0 q0Var = this.G;
        if (i7 == 1) {
            q0Var.b(hd.M0(2131743876, null), new z7(this, 0), false);
        } else if (i7 == 2) {
            q0Var.b(hd.M0(2131746082, null), new z7(this, 0), false);
        }
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        q0Var.setEnabled(z10);
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
        q0Var.setAlpha(f10);
        if (i7 != 1 && i7 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        q0Var.setScaleX(f11);
        if (i7 != 1 && i7 != 2) {
            f12 = 0.6f;
        } else {
            f12 = 1.0f;
        }
        q0Var.setScaleY(f12);
        if (i7 != 1 && i7 != 2) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        q0Var.setVisibility(i10);
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
        FrameLayout frameLayout = this.f30304y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.g0.L(26.0f);
        boolean z13 = hd.f24101a0;
        TextView textView3 = this.f30296c;
        ub ubVar = this.f30295b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) ubVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) ubVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f30300r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f30298f) {
            if (hd.f24101a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (hd.f24101a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, height, width - i7, getHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fp fpVar = this.f30297e;
        if (fpVar != null && fpVar.f34663a.f32441q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f) + (this.f30298f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.f30302w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f30303x && (frameLayout = this.f30304y) != null) {
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
        this.f30298f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f30299n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override
    public final void updateColors() {
    }
}
