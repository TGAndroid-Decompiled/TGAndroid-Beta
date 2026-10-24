package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class y extends za {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final u9 Z;
    public final org.telegram.ui.Cells.h3 f32748a0;
    public final org.telegram.ui.Cells.h3 f32749b0;
    public final FrameLayout f32750c0;
    public final vp f32751d0;
    public final FrameLayout f32752e0;
    public final FrameLayout f32753f0;
    public final ei.d f32754g0;
    public Long f32755h0;
    public x f32756i0;
    public TL_aicompose.TL_aiComposeTone f32757j0;
    public e f32758k0;
    public e f32759l0;
    public int m0;
    public a71 f32760n0;
    public int f32761o0;

    public y(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, 2, g6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, M, g6Var);
        this.e.addView(imageView, w7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f30024b;

            {
                this.f30024b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30024b.dismiss();
                        return;
                    case 1:
                        this.f30024b.V();
                        return;
                    default:
                        vp vpVar = this.f30024b.f32751d0;
                        vpVar.a(!vpVar.f32005a.f24297q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        int dp = AndroidUtilities.dp(100.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, g6Var);
        w7.b6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.z5.e(100, 100, 17));
        u9 u9Var = new u9(context);
        this.Z = u9Var;
        X();
        frameLayout2.addView(u9Var, w7.z5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f30024b;

            {
                this.f30024b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30024b.dismiss();
                        return;
                    case 1:
                        this.f30024b.V();
                        return;
                    default:
                        vp vpVar = this.f30024b.f32751d0;
                        vpVar.a(!vpVar.f32005a.f24297q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), g6Var);
        this.f32748a0 = h3Var;
        h3Var.d.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), g6Var);
        this.f32749b0 = h3Var2;
        h3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        h3Var2.d.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(linearLayout, Z, null, O2, g6Var);
        vp vpVar = new vp(context, 24, g6Var);
        this.f32751d0 = vpVar;
        vpVar.b(org.telegram.ui.ActionBar.k6.f21257h7, org.telegram.ui.ActionBar.k6.f21292j7, org.telegram.ui.ActionBar.k6.f21312k7);
        vpVar.setDrawUnchecked(true);
        vpVar.a(false, false);
        vpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(vpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q5, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f30024b;

            {
                this.f30024b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30024b.dismiss();
                        return;
                    case 1:
                        this.f30024b.V();
                        return;
                    default:
                        vp vpVar2 = this.f30024b.f32751d0;
                        vpVar2.a(!vpVar2.f32005a.f24297q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32750c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.z5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
        this.behindKeyboardColorKey = i13;
        setBackgroundColor(getThemedColor(i13));
        lm0 lm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new ci.x4(8, this, g6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f46376m = false;
        vVar.C = false;
        vVar.o(zr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f32752e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i13)), getThemedColor(i13), getThemedColor(i13)}));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 80);
        int i15 = e.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        e.leftMargin = i15 + i16;
        e.rightMargin += i16;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f32753f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i17 = d.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.containerView.addView(frameLayout5, d);
        ei.d g10 = org.telegram.messenger.tl.g(24, context, g6Var, true);
        this.f32754g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.ActionBar.s1(19, this, g6Var));
        frameLayout4.addView(g10, w7.z5.e(-1, 48, 119));
        W();
        this.f32760n0.N(false);
    }

    public static void P(y yVar, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var) {
        cVar.c(false);
        c2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f32757j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.h3 h3Var = yVar.f32749b0;
        org.telegram.ui.Cells.h3 h3Var2 = yVar.f32748a0;
        vp vpVar = yVar.f32751d0;
        ei.d dVar = yVar.f32754g0;
        if (!dVar.Q) {
            if (!dVar.f8862c0) {
                if (yVar.f32755h0 == null) {
                    yVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f32757j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = vpVar.f32005a.f24297q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f32757j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f32755h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = h3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = h3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f30666b;

                    {
                        this.f30666b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f30666b;
                                yVar2.f32754g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f32759l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.b1.s(yVar2.f32753f0, g6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.R(this.f30666b, g6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = vpVar.f32005a.f24297q;
            createtone.emoji_id = yVar.f32755h0.longValue();
            createtone.title = h3Var2.getText().toString();
            createtone.prompt = h3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f30666b;

                {
                    this.f30666b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f30666b;
                            yVar2.f32754g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f32759l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.b1.s(yVar2.f32753f0, g6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.R(this.f30666b, g6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f32753f0;
        yVar.f32754g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f32758k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(yVar.currentAccount, new vc(frameLayout, g6Var));
                return;
            }
            org.telegram.ui.Cells.b1.s(frameLayout, g6Var, tL_error, false);
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.c2 c2Var) {
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f32757j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new ai.s0(yVar, h, c2Var, 5));
    }

    public final void V() {
        if (this.f32756i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f32755h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f32756i0 = xVar;
        org.telegram.ui.r51[] r51VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        r51VarArr[0].b();
    }

    public final void W() {
        boolean z10;
        if (this.f32755h0 != null && this.f32748a0.getText().length() > 0 && this.f32749b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32754g0.setEnabled(z10);
    }

    public final void X() {
        this.m0 = 0;
        Long l4 = this.f32755h0;
        u9 u9Var = this.Z;
        if (l4 == null) {
            u9Var.setImageResource(R.drawable.menu_smile_add);
            u9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        u9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, this.f32755h0.longValue()));
        u9Var.setColorFilter(null);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21290j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f32752e0.setTranslationY(f7);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            if (themedColor != this.f32761o0) {
                this.f32761o0 = themedColor;
                setBackgroundColor(themedColor);
                this.f32752e0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        u9 u9Var = this.Z;
        if (u9Var != null) {
            try {
                if (this.f32755h0 == null) {
                    i10 = org.telegram.ui.ActionBar.k6.W5;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21290j5;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider);
                if (w02 != this.m0) {
                    this.m0 = w02;
                    if (this.f32755h0 == null) {
                        u9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.f32760n0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        int i10;
        if (this.f32757j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
