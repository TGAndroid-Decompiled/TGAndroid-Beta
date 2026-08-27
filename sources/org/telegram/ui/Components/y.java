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

public final class y extends qa {
    public final FrameLayout T;
    public final FrameLayout U;
    public final n9 V;
    public final org.telegram.ui.Cells.g3 W;
    public final org.telegram.ui.Cells.g3 X;
    public final FrameLayout Y;
    public final bp Z;

    public final FrameLayout f34738a0;

    public final FrameLayout f34739b0;

    public final lh.d f34740c0;

    public Long f34741d0;

    public x f34742e0;

    public TL_aicompose.TL_aiComposeTone f34743f0;

    public e f34744g0;

    public e f34745h0;

    public b51 f34746i0;

    public y(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, false, false, 2, c6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f31853e.addView(imageView, h7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        h7.b6.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final y f32014b;

            {
                this.f32014b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f32014b.dismiss();
                        break;
                    case 1:
                        this.f32014b.V();
                        break;
                    default:
                        bp bpVar = this.f32014b.Z;
                        bpVar.a(!bpVar.f27188a.f26309q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var)));
        h7.b6.a(frameLayout2);
        frameLayout.addView(frameLayout2, h7.z5.e(100, 100, 17));
        n9 n9Var = new n9(context);
        this.V = n9Var;
        X();
        frameLayout2.addView(n9Var, h7.z5.e(64, 64, 17));
        final int i12 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {

            public final y f32014b;

            {
                this.f32014b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f32014b.dismiss();
                        break;
                    case 1:
                        this.f32014b.V();
                        break;
                    default:
                        bp bpVar = this.f32014b.Z;
                        bpVar.a(!bpVar.f27188a.f26309q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), c6Var);
        this.W = g3Var;
        g3Var.f24370b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.X = g3Var2;
        g3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        g3Var2.f24370b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 24, 24));
        bp bpVar = new bp(context, 24, c6Var);
        this.Z = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.f23126h7, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(false, false);
        bpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(bpVar, h7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23283q5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        final int i13 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) {

            public final y f32014b;

            {
                this.f32014b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f32014b.dismiss();
                        break;
                    case 1:
                        this.f32014b.V();
                        break;
                    default:
                        bp bpVar2 = this.f32014b.Z;
                        bpVar2.a(!bpVar2.f27188a.f26309q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y = frameLayout3;
        frameLayout3.addView(linearLayout, h7.z5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i14 = org.telegram.ui.ActionBar.g6.f22999a7;
        this.behindKeyboardColorKey = i14;
        setBackgroundColor(getThemedColor(i14));
        zk0 zk0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new cg.x0(10, this, c6Var));
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.K = true;
        v vVar = new v(this);
        vVar.f5819m = false;
        vVar.C = false;
        vVar.o(er.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34738a0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14), getThemedColor(i14)}));
        FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, -2, 80);
        int i16 = layoutParamsE.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        layoutParamsE.leftMargin = i16 + i17;
        layoutParamsE.rightMargin += i17;
        this.containerView.addView(frameLayout4, layoutParamsE);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f34739b0 = frameLayout5;
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = layoutParamsD.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i18 + i19;
        layoutParamsD.rightMargin += i19;
        this.containerView.addView(frameLayout5, layoutParamsD);
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.f34740c0 = dVarG;
        dVarG.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        dVarG.setOnClickListener(new nh.x1(27, this, c6Var));
        frameLayout4.addView(dVarG, h7.z5.e(-1, 48, 119));
        W();
        this.f34746i0.N(false);
    }

    public static void P(y yVar, we.d dVar, org.telegram.ui.ActionBar.b2 b2Var) {
        dVar.c(false);
        b2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f34743f0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.g3 g3Var = yVar.X;
        org.telegram.ui.Cells.g3 g3Var2 = yVar.W;
        bp bpVar = yVar.Z;
        lh.d dVar = yVar.f34740c0;
        if (dVar.J) {
            return;
        }
        if (!dVar.S) {
            if (yVar.f34741d0 == null) {
                yVar.V();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (yVar.f34743f0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = bpVar.f27188a.f26309q;
            createtone.emoji_id = yVar.f34741d0.longValue();
            createtone.title = g3Var2.getText().toString();
            createtone.prompt = g3Var.getText().toString();
            final int i10 = 1;
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new org.telegram.messenger.a(), new Utilities.Callback2(yVar) {

                public final y f32602b;

                {
                    this.f32602b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (i10) {
                        case 0:
                            y yVar2 = this.f32602b;
                            yVar2.f34740c0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f34745h0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.pa.t(yVar2.f34739b0, c6Var, tL_error, false);
                            }
                            break;
                        default:
                            y.R(this.f32602b, c6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = bpVar.f27188a.f26309q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f34743f0);
        updatetone.flags |= 2;
        updatetone.emoji_id = yVar.f34741d0.longValue();
        updatetone.flags |= 4;
        updatetone.title = g3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = g3Var.getText().toString();
        final int i11 = 0;
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new org.telegram.messenger.a(), new Utilities.Callback2(yVar) {

            public final y f32602b;

            {
                this.f32602b = yVar;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                switch (i11) {
                    case 0:
                        y yVar2 = this.f32602b;
                        yVar2.f34740c0.setLoading(false);
                        if (aiComposeTone != null) {
                            e eVar = yVar2.f34745h0;
                            if (eVar != null) {
                                eVar.run(aiComposeTone);
                            }
                            yVar2.dismiss();
                        } else if (tL_error != null) {
                            org.telegram.ui.Cells.pa.t(yVar2.f34739b0, c6Var, tL_error, false);
                        }
                        break;
                    default:
                        y.R(this.f32602b, c6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.c6 c6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f34739b0;
        yVar.f34740c0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f34744g0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                org.telegram.ui.Cells.pa.t(frameLayout, c6Var, tL_error, false);
            } else {
                e0.o0(yVar.currentAccount, new mc(frameLayout, c6Var));
            }
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.b2 b2Var) {
        we.d dVarG = b2Var.g(-1, true, true);
        dVarG.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f34743f0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new gh.d0(yVar, dVarG, b2Var, 7));
    }

    public final void V() {
        if (this.f34742e0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r51VarArr);
        wVar.setSelected(this.f34741d0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f34742e0 = xVar;
        org.telegram.ui.r51[] r51VarArr = {xVar};
        xVar.showAsDropDown(this.U, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        r51VarArr[0].b();
    }

    public final void W() {
        this.f34740c0.setEnabled(this.f34741d0 != null && this.W.getText().length() > 0 && this.X.getText().length() > 0);
    }

    public final void X() {
        Long l10 = this.f34741d0;
        n9 n9Var = this.V;
        if (l10 == null) {
            n9Var.setImageResource(R.drawable.menu_smile_add);
            n9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            n9Var.setAnimatedEmojiDrawable(new k5(4, this.currentAccount, this.f34741d0.longValue()));
            n9Var.setColorFilter(null);
            n9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.f34738a0.setTranslationY(f10);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.f34746i0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(this.f34743f0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
