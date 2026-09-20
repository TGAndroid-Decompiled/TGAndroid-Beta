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
public final class y extends ab {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final v9 Z;
    public final org.telegram.ui.Cells.k3 f30400a0;
    public final org.telegram.ui.Cells.k3 f30401b0;
    public final FrameLayout f30402c0;
    public final np f30403d0;
    public final FrameLayout f30404e0;
    public final FrameLayout f30405f0;
    public final ci.d f30406g0;
    public Long f30407h0;
    public x f30408i0;
    public TL_aicompose.TL_aiComposeTone f30409j0;
    public e f30410k0;
    public e f30411l0;
    public k61 m0;

    public y(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.y5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f27700b;

            {
                this.f27700b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f27700b.dismiss();
                        return;
                    case 1:
                        this.f27700b.V();
                        return;
                    default:
                        np npVar = this.f27700b.f30403d0;
                        npVar.a(!npVar.f26710a.f22193q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, f6Var)));
        w7.b6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.y5.e(100, 100, 17));
        v9 v9Var = new v9(context);
        this.Z = v9Var;
        X();
        frameLayout2.addView(v9Var, w7.y5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f27700b;

            {
                this.f27700b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f27700b.dismiss();
                        return;
                    case 1:
                        this.f27700b.V();
                        return;
                    default:
                        np npVar = this.f27700b.f30403d0;
                        npVar.a(!npVar.f26710a.f22193q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), f6Var);
        this.f30400a0 = k3Var;
        k3Var.f20527b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f30401b0 = k3Var2;
        k3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        k3Var2.f20527b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, f6Var), 24, 24));
        np npVar = new np(context, 24, f6Var);
        this.f30403d0 = npVar;
        npVar.b(org.telegram.ui.ActionBar.j6.f19167h7, org.telegram.ui.ActionBar.j6.f19203j7, org.telegram.ui.ActionBar.j6.f19223k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(npVar, w7.y5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.rk.n(org.telegram.ui.ActionBar.j6.f19332q5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.y5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f27700b;

            {
                this.f27700b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f27700b.dismiss();
                        return;
                    case 1:
                        this.f27700b.V();
                        return;
                    default:
                        np npVar2 = this.f27700b.f30403d0;
                        npVar2.a(!npVar2.f26710a.f22193q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30402c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.y5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f19038a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new ai.o6(8, this, f6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f43009m = false;
        vVar.C = false;
        vVar.o(qr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f30404e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f30405f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout5, d);
        ci.d g10 = org.telegram.messenger.rk.g(24, context, f6Var, true);
        this.f30406g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.sf(9, this, f6Var));
        frameLayout4.addView(g10, w7.y5.e(-1, 48, 119));
        W();
        this.m0.N(false);
    }

    public static void P(y yVar, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var) {
        eVar.c(false);
        b2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f30409j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.k3 k3Var = yVar.f30401b0;
        org.telegram.ui.Cells.k3 k3Var2 = yVar.f30400a0;
        np npVar = yVar.f30403d0;
        ci.d dVar = yVar.f30406g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (yVar.f30407h0 == null) {
                    yVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f30409j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = npVar.f26710a.f22193q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f30409j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f30407h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = k3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = k3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f28241b;

                    {
                        this.f28241b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f28241b;
                                yVar2.f30406g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f30411l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c1.s(yVar2.f30405f0, f6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.R(this.f28241b, f6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = npVar.f26710a.f22193q;
            createtone.emoji_id = yVar.f30407h0.longValue();
            createtone.title = k3Var2.getText().toString();
            createtone.prompt = k3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f28241b;

                {
                    this.f28241b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f28241b;
                            yVar2.f30406g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f30411l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.c1.s(yVar2.f30405f0, f6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.R(this.f28241b, f6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f30405f0;
        yVar.f30406g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f30410k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(yVar.currentAccount, new xc(frameLayout, f6Var));
                return;
            }
            org.telegram.ui.Cells.c1.s(frameLayout, f6Var, tL_error, false);
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.b2 b2Var) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f30409j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(yVar, g10, b2Var, 3));
    }

    public final void V() {
        if (this.f30408i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f30407h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f30408i0 = xVar;
        org.telegram.ui.a71[] a71VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        a71VarArr[0].b();
    }

    public final void W() {
        boolean z10;
        if (this.f30407h0 != null && this.f30400a0.getText().length() > 0 && this.f30401b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30406g0.setEnabled(z10);
    }

    public final void X() {
        Long l4 = this.f30407h0;
        v9 v9Var = this.Z;
        if (l4 == null) {
            v9Var.setImageResource(R.drawable.menu_smile_add);
            v9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        v9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, this.f30407h0.longValue()));
        v9Var.setColorFilter(null);
        v9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19201j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f30404e0.setTranslationY(f7);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(vl0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f30409j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
