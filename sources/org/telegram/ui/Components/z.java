package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class z extends ab {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final w9 Z;
    public final org.telegram.ui.Cells.i3 f29538a0;
    public final org.telegram.ui.Cells.i3 f29539b0;
    public final FrameLayout f29540c0;
    public final tp f29541d0;
    public final FrameLayout f29542e0;
    public final FrameLayout f29543f0;
    public final bi.d f29544g0;
    public Long f29545h0;
    public y f29546i0;
    public TL_aicompose.TL_aiComposeTone f29547j0;
    public f f29548k0;
    public f f29549l0;
    public j61 m0;

    public z(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.a6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.c6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z f26884b;

            {
                this.f26884b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f26884b.dismiss();
                        return;
                    case 1:
                        this.f26884b.V();
                        return;
                    default:
                        tp tpVar = this.f26884b.f29541d0;
                        tpVar.a(!tpVar.f27462a.f21057q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
        w7.c6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.a6.e(100, 100, 17));
        w9 w9Var = new w9(context);
        this.Z = w9Var;
        X();
        frameLayout2.addView(w9Var, w7.a6.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z f26884b;

            {
                this.f26884b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f26884b.dismiss();
                        return;
                    case 1:
                        this.f26884b.V();
                        return;
                    default:
                        tp tpVar = this.f26884b.f29541d0;
                        tpVar.a(!tpVar.f27462a.f21057q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), f6Var);
        this.f29538a0 = i3Var;
        i3Var.f19293b.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f29539b0 = i3Var2;
        i3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        i3Var2.f19293b.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 24, 24));
        tp tpVar = new tp(context, 24, f6Var);
        this.f29541d0 = tpVar;
        tpVar.b(org.telegram.ui.ActionBar.j6.f18000h7, org.telegram.ui.ActionBar.j6.f18036j7, org.telegram.ui.ActionBar.j6.f18056k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(false, false);
        tpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(tpVar, w7.a6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f18161q5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z f26884b;

            {
                this.f26884b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f26884b.dismiss();
                        return;
                    case 1:
                        this.f26884b.V();
                        return;
                    default:
                        tp tpVar2 = this.f26884b.f29541d0;
                        tpVar2.a(!tpVar2.f27462a.f21057q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f29540c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.a6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new ai.b0(7, this, f6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        w wVar = new w(this);
        wVar.f41645m = false;
        wVar.C = false;
        wVar.o(wr.h);
        wVar.n(350L);
        this.d.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f29542e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e = w7.a6.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f29543f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.a6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout5, d);
        bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var, true);
        this.f29544g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.sh(6, this, f6Var));
        frameLayout4.addView(g10, w7.a6.e(-1, 48, 119));
        W();
        this.m0.N(false);
    }

    public static void P(z zVar, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var) {
        eVar.c(false);
        d2Var.dismiss();
        zVar.dismiss();
        MessagesController.getInstance(zVar.currentAccount).getTonesController().remove(zVar.f29547j0);
    }

    public static void Q(final z zVar, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.i3 i3Var = zVar.f29539b0;
        org.telegram.ui.Cells.i3 i3Var2 = zVar.f29538a0;
        tp tpVar = zVar.f29541d0;
        bi.d dVar = zVar.f29544g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (zVar.f29545h0 == null) {
                    zVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (zVar.f29547j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = tpVar.f27462a.f21057q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f29547j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = zVar.f29545h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = i3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = i3Var.getText().toString();
                ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(zVar) {
                    public final z f27529b;

                    {
                        this.f27529b = zVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                z zVar2 = this.f27529b;
                                zVar2.f29544g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    f fVar = zVar2.f29549l0;
                                    if (fVar != null) {
                                        fVar.run(aiComposeTone);
                                    }
                                    zVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.r6.q(zVar2.f29543f0, f6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                z.R(this.f27529b, f6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = tpVar.f27462a.f21057q;
            createtone.emoji_id = zVar.f29545h0.longValue();
            createtone.title = i3Var2.getText().toString();
            createtone.prompt = i3Var.getText().toString();
            ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(zVar) {
                public final z f27529b;

                {
                    this.f27529b = zVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            z zVar2 = this.f27529b;
                            zVar2.f29544g0.setLoading(false);
                            if (aiComposeTone != null) {
                                f fVar = zVar2.f29549l0;
                                if (fVar != null) {
                                    fVar.run(aiComposeTone);
                                }
                                zVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.r6.q(zVar2.f29543f0, f6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            z.R(this.f27529b, f6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(z zVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = zVar.f29543f0;
        zVar.f29544g0.setLoading(false);
        if (aiComposeTone != null) {
            zVar.dismiss();
            f fVar = zVar.f29548k0;
            if (fVar != null) {
                fVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                g0.o0(zVar.currentAccount, new wc(frameLayout, f6Var));
                return;
            }
            org.telegram.ui.Cells.r6.q(frameLayout, f6Var, tL_error, false);
        }
    }

    public static void S(z zVar, org.telegram.ui.ActionBar.d2 d2Var) {
        nf.e g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f29547j0);
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.g(zVar, g10, d2Var, 3));
    }

    public final void V() {
        if (this.f29546i0 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        xVar.setSelected(this.f29545h0);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.f29546i0 = yVar;
        org.telegram.ui.c71[] c71VarArr = {yVar};
        yVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        c71VarArr[0].b();
    }

    public final void W() {
        boolean z10;
        if (this.f29545h0 != null && this.f29538a0.getText().length() > 0 && this.f29539b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29544g0.setEnabled(z10);
    }

    public final void X() {
        Long l4 = this.f29545h0;
        w9 w9Var = this.Z;
        if (l4 == null) {
            w9Var.setImageResource(R.drawable.menu_smile_add);
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        w9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, this.f29545h0.longValue()));
        w9Var.setColorFilter(null);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f29542e0.setTranslationY(f7);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new e(this, 2), this.resourcesProvider);
        this.m0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f29547j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
