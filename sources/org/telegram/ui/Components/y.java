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
public final class y extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final y9 Z;
    public final org.telegram.ui.Cells.g3 f34857a0;
    public final org.telegram.ui.Cells.g3 f34858b0;
    public final FrameLayout f34859c0;
    public final zp f34860d0;
    public final FrameLayout f34861e0;
    public final FrameLayout f34862f0;
    public final fi.d f34863g0;
    public Long f34864h0;
    public x f34865i0;
    public TL_aicompose.TL_aiComposeTone f34866j0;
    public e f34867k0;
    public e f34868l0;
    public int m0;
    public j71 f34869n0;
    public int f34870o0;

    public y(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, true, false, 2, u6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, L, u6Var);
        this.e.addView(imageView, gb1.h(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        gb1.c(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f32068b;

            {
                this.f32068b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32068b.dismiss();
                        return;
                    case 1:
                        this.f32068b.V();
                        return;
                    default:
                        zp zpVar = this.f32068b.f34860d0;
                        zpVar.a(!zpVar.f35382a.f26089q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        int dp = AndroidUtilities.dp(100.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, u6Var);
        gb1.b(frameLayout2);
        frameLayout.addView(frameLayout2, gb1.i(100, 100, 17));
        y9 y9Var = new y9(context);
        this.Z = y9Var;
        X();
        frameLayout2.addView(y9Var, gb1.i(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f32068b;

            {
                this.f32068b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32068b.dismiss();
                        return;
                    case 1:
                        this.f32068b.V();
                        return;
                    default:
                        zp zpVar = this.f32068b.f34860d0;
                        zpVar.a(!zpVar.f35382a.f26089q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), u6Var);
        this.f34857a0 = g3Var;
        g3Var.d.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), u6Var);
        this.f34858b0 = g3Var2;
        g3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        g3Var2.d.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 24, 24);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N2, u6Var);
        zp zpVar = new zp(context, 24, u6Var);
        this.f34860d0 = zpVar;
        zpVar.b(org.telegram.ui.ActionBar.y6.f23429h7, org.telegram.ui.ActionBar.y6.f23466j7, org.telegram.ui.ActionBar.y6.f23485k7);
        zpVar.setDrawUnchecked(true);
        zpVar.a(false, false);
        zpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(zpVar, gb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q5, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, gb1.x(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f32068b;

            {
                this.f32068b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32068b.dismiss();
                        return;
                    case 1:
                        this.f32068b.V();
                        return;
                    default:
                        zp zpVar2 = this.f32068b.f34860d0;
                        zpVar2.a(!zpVar2.f35382a.f26089q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f34859c0 = frameLayout3;
        frameLayout3.addView(linearLayout, gb1.h(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i13 = org.telegram.ui.ActionBar.y6.f23299a7;
        this.behindKeyboardColorKey = i13;
        setBackgroundColor(getThemedColor(i13));
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.u1();
        this.d.setOnItemClickListener(new di.x4(8, this, u6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f47763m = false;
        vVar.C = false;
        vVar.o(ds.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34861e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i13)), getThemedColor(i13), getThemedColor(i13)}));
        FrameLayout.LayoutParams i15 = gb1.i(-1, -2, 80);
        int i16 = i15.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        i15.leftMargin = i16 + i17;
        i15.rightMargin += i17;
        this.containerView.addView(frameLayout4, i15);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f34862f0 = frameLayout5;
        FrameLayout.LayoutParams h = gb1.h(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = h.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        h.leftMargin = i18 + i19;
        h.rightMargin += i19;
        this.containerView.addView(frameLayout5, h);
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        this.f34863g0 = f7;
        f7.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        f7.setOnClickListener(new org.telegram.ui.ActionBar.u1(19, this, u6Var));
        frameLayout4.addView(f7, gb1.i(-1, 48, 119));
        W();
        this.f34869n0.O(false);
    }

    public static void P(y yVar, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var) {
        cVar.c(false);
        e2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f34866j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.Cells.g3 g3Var = yVar.f34858b0;
        org.telegram.ui.Cells.g3 g3Var2 = yVar.f34857a0;
        zp zpVar = yVar.f34860d0;
        fi.d dVar = yVar.f34863g0;
        if (!dVar.Q) {
            if (!dVar.f10687c0) {
                if (yVar.f34864h0 == null) {
                    yVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f34866j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = zpVar.f35382a.f26089q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f34866j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f34864h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = g3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = g3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f32800b;

                    {
                        this.f32800b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f32800b;
                                yVar2.f34863g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f34868l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.d3.t(yVar2.f34862f0, u6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.R(this.f32800b, u6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = zpVar.f35382a.f26089q;
            createtone.emoji_id = yVar.f34864h0.longValue();
            createtone.title = g3Var2.getText().toString();
            createtone.prompt = g3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f32800b;

                {
                    this.f32800b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f32800b;
                            yVar2.f34863g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f34868l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.d3.t(yVar2.f34862f0, u6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.R(this.f32800b, u6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.u6 u6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f34862f0;
        yVar.f34863g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f34867k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(yVar.currentAccount, new wc(frameLayout, u6Var));
                return;
            }
            org.telegram.ui.d3.t(frameLayout, u6Var, tL_error, false);
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.e2 e2Var) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f34866j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new bi.t0(yVar, h, e2Var, 5));
    }

    public final void V() {
        if (this.f34865i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f34864h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f34865i0 = xVar;
        org.telegram.ui.t51[] t51VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        t51VarArr[0].b();
    }

    public final void W() {
        boolean z10;
        if (this.f34864h0 != null && this.f34857a0.getText().length() > 0 && this.f34858b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34863g0.setEnabled(z10);
    }

    public final void X() {
        this.m0 = 0;
        Long l4 = this.f34864h0;
        y9 y9Var = this.Z;
        if (l4 == null) {
            y9Var.setImageResource(R.drawable.menu_smile_add);
            y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        y9Var.setAnimatedEmojiDrawable(new t5(4, this.currentAccount, this.f34864h0.longValue()));
        y9Var.setColorFilter(null);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f34861e0.setTranslationY(f7);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7);
            if (themedColor != this.f34870o0) {
                this.f34870o0 = themedColor;
                setBackgroundColor(themedColor);
                this.f34861e0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        y9 y9Var = this.Z;
        if (y9Var != null) {
            try {
                if (this.f34864h0 == null) {
                    i10 = org.telegram.ui.ActionBar.y6.W5;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23464j5;
                }
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider);
                if (w02 != this.m0) {
                    this.m0 = w02;
                    if (this.f34864h0 == null) {
                        y9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.f34869n0 = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f34866j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
