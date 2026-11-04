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
import b8.mf;
import b8.pf;
import ci.ec;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.lc;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public final class f8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView E;
    public final TextView F;
    public final vg.o0 G;
    public final ImageView H;
    public AnimatorSet I;
    public final int f29235a;
    public final ec f29236b;
    public final TextView f29237c;
    public final org.telegram.ui.Components.k9 d;
    public final wo f29238e;
    public boolean f29239f;
    public final ImageView h;
    public final ImageView f29240n;
    public TLRPC.TL_messages_stickerSet f29241r;
    public boolean f29242s;
    public final Rect f29243w;
    public boolean f29244x;
    public final FrameLayout f29245y;

    public f8(Context context, int i3) {
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
        this.f29243w = new Rect();
        this.f29235a = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        boolean z10 = bd.f21784a0;
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
        addView(k9Var, mf.d(40, 40.0f, i19, f10, 9.0f, f11, 0.0f));
        if (i3 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i3 != 3) {
                int i20 = org.telegram.ui.ActionBar.k6.Ji;
                y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i20, false), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i20);
                imageView.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
            }
            if (i3 == 1) {
                int i21 = org.telegram.ui.ActionBar.k6.Ii;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(imageView, i21, null, mode);
                imageView.setImageResource(2131232041);
                imageView.setContentDescription(bd.M0(2131754839, null));
                if (bd.f21784a0) {
                    i18 = 3;
                } else {
                    i18 = 5;
                }
                addView(imageView, mf.e(40, 40, i18 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f29240n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(2131231627);
                org.telegram.ui.ActionBar.r6.t(imageView2, i21, null, mode);
                addView(imageView2, mf.h(58.0f, 58.0f, 8388613));
                wo woVar = new wo(21, context, null);
                this.f29238e = woVar;
                woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
                woVar.setDrawUnchecked(false);
                woVar.setDrawBackgroundAsArc(3);
                addView(woVar, mf.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i3 == 3) {
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131231195);
                boolean z11 = bd.f21784a0;
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
                addView(imageView, mf.d(40, 40.0f, i22, i17, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f29245y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        int i23 = org.telegram.ui.ActionBar.k6.Ci;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i23);
        int i24 = org.telegram.ui.ActionBar.k6.Ei;
        y d = org.telegram.ui.ActionBar.y5.d(v02, org.telegram.ui.ActionBar.k6.v0(i24), 14.0f);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i23);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i24);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.r6.k(textView, d, N2, N3, null);
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new z7(this, 0));
        if (bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(textView, mf.h(-2.0f, 28.0f, i11 | 16));
        pf.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(bd.M0(2131744865, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Fi, null);
        y d10 = org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.k6.v0(i23) & 452984831, 14.0f);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i23, 26);
        textView2.setBackground(d10);
        org.telegram.ui.ActionBar.r6.k(textView2, d10, null, h, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new z7(this, 0));
        if (bd.f21784a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView2, mf.i(-2.0f, 32.0f, i12 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        pf.a(textView2);
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(4.0f), context, null, false);
        this.G = o0Var;
        o0Var.setIcon(2131624314);
        o0Var.b(bd.M0(2131743886, null), new z7(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) o0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            o0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f29245y;
        vg.o0 o0Var2 = this.G;
        if (bd.f21784a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout2.addView(o0Var2, mf.h(-2.0f, 28.0f, i13 | 16));
        pf.a(this.G);
        this.f29245y.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        View view = this.f29245y;
        if (bd.f21784a0) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(view, mf.d(-2, -1.0f, i14, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29245y.setOnClickListener(new z7(this, 1));
        ec ecVar = new ec(context, 9);
        this.f29236b = ecVar;
        hs.i(ecVar);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, null);
        ecVar.setTextSize(1, 16.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setLines(1);
        ecVar.setMaxLines(1);
        ecVar.setSingleLine(true);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        ecVar.setGravity(mf.y());
        addView(ecVar, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f29237c = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28290z6, null);
        org.telegram.messenger.camera.q.n(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(mf.y());
        addView(textView3, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i3 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(2131232096);
            imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.f28273y6, null, PorterDuff.Mode.SRC_IN);
            int i25 = org.telegram.ui.ActionBar.k6.f27972i6;
            y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i25, false), 1, -1);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i25);
            imageView3.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(imageView3, h03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z12 = bd.f21784a0;
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
            addView(imageView3, mf.d(-2, -2.0f, i26, f12, 0.0f, f13, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i3 = this.f29235a;
        if (i3 == 1) {
            return this.f29238e.f40035a.f31334q;
        }
        if (i3 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f29244x || this.f29245y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        int i3 = this.f29235a;
        if (i3 == 1) {
            this.f29238e.a(z10, z11);
            return;
        }
        int i10 = 4;
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (i3 == 3) {
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
        } else if (this.f29244x) {
            FrameLayout frameLayout = this.f29245y;
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
        if (this.f29235a == 1) {
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
            ImageView imageView = this.f29240n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            xq xqVar = ks.f35474a;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final f8 f28951b;

                {
                    this.f28951b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            f8 f8Var = this.f28951b;
                            if (!z11) {
                                f8Var.f29240n.setVisibility(8);
                                return;
                            } else {
                                f8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            f8 f8Var2 = this.f28951b;
                            if (z12) {
                                f8Var2.f29245y.setVisibility(8);
                                return;
                            } else {
                                f8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            f8 f8Var3 = this.f28951b;
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
            if (this.f29244x) {
                FrameLayout frameLayout = this.f29245y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                    public final f8 f28951b;

                    {
                        this.f28951b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                f8 f8Var = this.f28951b;
                                if (!z11) {
                                    f8Var.f29240n.setVisibility(8);
                                    return;
                                } else {
                                    f8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                f8 f8Var2 = this.f28951b;
                                if (z12) {
                                    f8Var2.f29245y.setVisibility(8);
                                    return;
                                } else {
                                    f8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                f8 f8Var3 = this.f28951b;
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
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final f8 f28951b;

                {
                    this.f28951b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            f8 f8Var = this.f28951b;
                            if (!z11) {
                                f8Var.f29240n.setVisibility(8);
                                return;
                            } else {
                                f8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            f8 f8Var2 = this.f28951b;
                            if (z12) {
                                f8Var2.f29245y.setVisibility(8);
                                return;
                            } else {
                                f8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            f8 f8Var3 = this.f28951b;
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
        int i3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        TLRPC.Document document;
        ac k10;
        int i10;
        String str2;
        this.f29239f = z10;
        this.f29241r = tL_messages_stickerSet;
        this.f29242s = z11;
        org.telegram.ui.Components.k9 k9Var = this.d;
        k9Var.setVisibility(0);
        ec ecVar = this.f29236b;
        ecVar.setTranslationY(0.0f);
        ecVar.setText(this.f29241r.set.title);
        boolean z12 = this.f29241r.set.archived;
        TextView textView = this.f29237c;
        if (z12) {
            ecVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            k9Var.setAlpha(0.5f);
        } else {
            ecVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            k9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f29244x = z13;
        int i11 = 8;
        if (z13) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f29245y.setVisibility(i3);
        if (!this.f29244x) {
            i11 = 0;
        }
        this.h.setVisibility(i11);
        k9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f29244x) {
                str3 = "EmojiCount";
            }
            textView.setText(bd.G(arrayList.size(), str3, new Object[0]));
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    document = arrayList.get(i12);
                    if (document != null && document.f27007id == tL_messages_stickerSet.set.thumb_document_id) {
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
            lc.e(1);
            TLObject w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w10 == null) {
                w10 = document2;
            }
            jz d = org.telegram.messenger.t5.d(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, false);
            boolean z14 = w10 instanceof TLRPC.Document;
            if (z14) {
                k10 = ac.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2);
            } else {
                k10 = ac.k((TLRPC.PhotoSize) w10, document2, tL_messages_stickerSet.set.thumb_version);
            }
            ac acVar = k10;
            if (this.f29244x) {
                i10 = 16388;
            } else {
                i10 = 1;
            }
            if (!lc.e(i10)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!zi.L2(document2, true) && !zi.O4(document2))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (acVar != null && acVar.f21497p == 1) {
                    k9Var.k(acVar, concat, "tgs", d, tL_messages_stickerSet2);
                } else {
                    k9Var.k(acVar, concat, "webp", d, tL_messages_stickerSet2);
                }
            } else {
                if (d != null) {
                    k9Var.p(ac.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    k9Var.l(ac.b(document2), concat, acVar, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (zi.D4(document2)) {
                    k9Var.setColorFilter(org.telegram.ui.ActionBar.k6.f28211v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(bd.G(0, str3, new Object[0]));
            k9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.g5.g(h10.f22829t0).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.d5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        org.telegram.messenger.g0.h3(new ea(7, f8.this, document3));
                    }
                });
            }
        }
        if (this.f29242s) {
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

    public final void e(int i3) {
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
        vg.o0 o0Var = this.G;
        if (i3 == 1) {
            o0Var.b(bd.M0(2131743886, null), new z7(this, 0), false);
        } else if (i3 == 2) {
            o0Var.b(bd.M0(2131746092, null), new z7(this, 0), false);
        }
        if (i3 != 1 && i3 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        o0Var.setEnabled(z10);
        if (i3 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.E;
        textView.setEnabled(z11);
        if (i3 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.F;
        textView2.setEnabled(z12);
        float f17 = 0.0f;
        float f18 = 1.0f;
        if (i3 != 1 && i3 != 2) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        o0Var.setAlpha(f10);
        if (i3 != 1 && i3 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        o0Var.setScaleX(f11);
        if (i3 != 1 && i3 != 2) {
            f12 = 0.6f;
        } else {
            f12 = 1.0f;
        }
        o0Var.setScaleY(f12);
        if (i3 != 1 && i3 != 2) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        o0Var.setVisibility(i10);
        if (i3 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        textView.setAlpha(f13);
        if (i3 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleX(f14);
        if (i3 == 3) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView.setScaleY(f15);
        if (i3 == 3) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (i3 == 4) {
            f17 = 1.0f;
        }
        textView2.setAlpha(f17);
        if (i3 == 4) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView2.setScaleX(f16);
        if (i3 != 4) {
            f18 = 0.6f;
        }
        textView2.setScaleY(f18);
        if (i3 != 4) {
            i12 = 8;
        }
        textView2.setVisibility(i12);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824);
        FrameLayout frameLayout = this.f29245y;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + org.telegram.messenger.g0.L(26.0f);
        boolean z13 = bd.f21784a0;
        TextView textView3 = this.f29237c;
        ec ecVar = this.f29236b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) ecVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) ecVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f29241r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.f29239f) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, height, width - i3, getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.f29238e;
        if (woVar != null && woVar.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f) + (this.f29239f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.f29243w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f29244x && (frameLayout = this.f29245y) != null) {
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
        int i3;
        ImageView imageView = this.H;
        if (imageView != null) {
            if (onClickListener == null) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f29239f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f29240n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override
    public final void updateColors() {
    }
}
