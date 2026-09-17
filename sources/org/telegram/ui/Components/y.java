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
public final class y extends za {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final u9 Z;
    public final org.telegram.ui.Cells.i3 f30043a0;
    public final org.telegram.ui.Cells.i3 f30044b0;
    public final FrameLayout f30045c0;
    public final np f30046d0;
    public final FrameLayout f30047e0;
    public final FrameLayout f30048f0;
    public final ci.d f30049g0;
    public Long f30050h0;
    public x f30051i0;
    public TL_aicompose.TL_aiComposeTone f30052j0;
    public e f30053k0;
    public e f30054l0;
    public x51 m0;

    public y(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f27467b;

            {
                this.f27467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f27467b.dismiss();
                        return;
                    case 1:
                        this.f27467b.V();
                        return;
                    default:
                        np npVar = this.f27467b.f30046d0;
                        npVar.a(!npVar.f26508a.f21982q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, f6Var)));
        w7.z5.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.x5.e(100, 100, 17));
        u9 u9Var = new u9(context);
        this.Z = u9Var;
        X();
        frameLayout2.addView(u9Var, w7.x5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f27467b;

            {
                this.f27467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f27467b.dismiss();
                        return;
                    case 1:
                        this.f27467b.V();
                        return;
                    default:
                        np npVar = this.f27467b.f30046d0;
                        npVar.a(!npVar.f26508a.f21982q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), f6Var);
        this.f30043a0 = i3Var;
        i3Var.f20239b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f30044b0 = i3Var2;
        i3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        i3Var2.f20239b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i6, f6Var), 24, 24));
        np npVar = new np(context, 24, f6Var);
        this.f30046d0 = npVar;
        npVar.b(org.telegram.ui.ActionBar.j6.f18935h7, org.telegram.ui.ActionBar.j6.f18971j7, org.telegram.ui.ActionBar.j6.f18991k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(npVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.f19099q5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f27467b;

            {
                this.f27467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f27467b.dismiss();
                        return;
                    case 1:
                        this.f27467b.V();
                        return;
                    default:
                        np npVar2 = this.f27467b.f30046d0;
                        npVar2.a(!npVar2.f26508a.f21982q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30045c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.x5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f18806a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        ml0 ml0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new ai.o6(8, this, f6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f42732m = false;
        vVar.C = false;
        vVar.o(qr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f30047e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e = w7.x5.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f30048f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout5, d);
        ci.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.f30049g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.tf(9, this, f6Var));
        frameLayout4.addView(g10, w7.x5.e(-1, 48, 119));
        W();
        this.m0.N(false);
    }

    public static void P(y yVar, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var) {
        eVar.c(false);
        c2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f30052j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.i3 i3Var = yVar.f30044b0;
        org.telegram.ui.Cells.i3 i3Var2 = yVar.f30043a0;
        np npVar = yVar.f30046d0;
        ci.d dVar = yVar.f30049g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (yVar.f30050h0 == null) {
                    yVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f30052j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = npVar.f26508a.f21982q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f30052j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f30050h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = i3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = i3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f27965b;

                    {
                        this.f27965b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f27965b;
                                yVar2.f30049g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f30054l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.p6.q(yVar2.f30048f0, f6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.R(this.f27965b, f6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = npVar.f26508a.f21982q;
            createtone.emoji_id = yVar.f30050h0.longValue();
            createtone.title = i3Var2.getText().toString();
            createtone.prompt = i3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f27965b;

                {
                    this.f27965b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f27965b;
                            yVar2.f30049g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f30054l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.p6.q(yVar2.f30048f0, f6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.R(this.f27965b, f6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f30048f0;
        yVar.f30049g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f30053k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(yVar.currentAccount, new vc(frameLayout, f6Var));
                return;
            }
            org.telegram.ui.Cells.p6.q(frameLayout, f6Var, tL_error, false);
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.c2 c2Var) {
        nf.e g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f30052j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(yVar, g10, c2Var, 3));
    }

    public final void V() {
        if (this.f30051i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f30050h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f30051i0 = xVar;
        org.telegram.ui.z61[] z61VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        z61VarArr[0].b();
    }

    public final void W() {
        boolean z10;
        if (this.f30050h0 != null && this.f30043a0.getText().length() > 0 && this.f30044b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30049g0.setEnabled(z10);
    }

    public final void X() {
        Long l4 = this.f30050h0;
        u9 u9Var = this.Z;
        if (l4 == null) {
            u9Var.setImageResource(R.drawable.menu_smile_add);
            u9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        u9Var.setAnimatedEmojiDrawable(new o5(4, this.currentAccount, this.f30050h0.longValue()));
        u9Var.setColorFilter(null);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18969j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f30047e0.setTranslationY(f7);
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(ml0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = x51Var;
        x51Var.f29851r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f30052j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
