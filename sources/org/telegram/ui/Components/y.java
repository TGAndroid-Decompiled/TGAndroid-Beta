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
public final class y extends cb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final w9 Z;
    public final org.telegram.ui.Cells.j3 f33001a0;
    public final org.telegram.ui.Cells.j3 f33002b0;
    public final FrameLayout f33003c0;
    public final qp f33004d0;
    public final FrameLayout f33005e0;
    public final FrameLayout f33006f0;
    public final ci.d f33007g0;
    public Long f33008h0;
    public x f33009i0;
    public TL_aicompose.TL_aiComposeTone f33010j0;
    public e f33011k0;
    public e f33012l0;
    public u61 m0;

    public y(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, true, false, 2, d6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f25301e.addView(imageView, w7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f30215b;

            {
                this.f30215b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30215b.dismiss();
                        return;
                    case 1:
                        this.f30215b.T();
                        return;
                    default:
                        qp qpVar = this.f30215b.f33004d0;
                        qpVar.a(!qpVar.f30140a.f24093q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, d6Var)));
        w7.b6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.z5.e(100, 100, 17));
        w9 w9Var = new w9(context);
        this.Z = w9Var;
        W();
        frameLayout2.addView(w9Var, w7.z5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f30215b;

            {
                this.f30215b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30215b.dismiss();
                        return;
                    case 1:
                        this.f30215b.T();
                        return;
                    default:
                        qp qpVar = this.f30215b.f33004d0;
                        qpVar.a(!qpVar.f30140a.f24093q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), d6Var);
        this.f33001a0 = j3Var;
        j3Var.f22306b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), d6Var);
        this.f33002b0 = j3Var2;
        j3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        j3Var2.f22306b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var), 24, 24));
        qp qpVar = new qp(context, 24, d6Var);
        this.f33004d0 = qpVar;
        qpVar.b(org.telegram.ui.ActionBar.i6.f20891h7, org.telegram.ui.ActionBar.i6.f20927j7, org.telegram.ui.ActionBar.i6.f20947k7);
        qpVar.setDrawUnchecked(true);
        qpVar.a(false, false);
        qpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(qpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.i6.f21057q5, d6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f30215b;

            {
                this.f30215b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30215b.dismiss();
                        return;
                    case 1:
                        this.f30215b.T();
                        return;
                    default:
                        qp qpVar2 = this.f30215b.f33004d0;
                        qpVar2.a(!qpVar2.f30140a.f24093q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33003c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.z5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i11 = org.telegram.ui.ActionBar.i6.f20761a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        zl0 zl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.s1();
        this.d.setOnItemClickListener(new ai.n6(8, this, d6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f46562m = false;
        vVar.C = false;
        vVar.o(tr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33005e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e7 = w7.z5.e(-1, -2, 80);
        int i13 = e7.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e7.leftMargin = i13 + i14;
        e7.rightMargin += i14;
        this.containerView.addView(frameLayout4, e7);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f33006f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout5, d);
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        this.f33007g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.qf(9, this, d6Var));
        frameLayout4.addView(g10, w7.z5.e(-1, 48, 119));
        U();
        this.m0.N(false);
    }

    public static void N(y yVar, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var) {
        eVar.c(false);
        b2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f33010j0);
    }

    public static void O(final y yVar, final org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.Cells.j3 j3Var = yVar.f33002b0;
        org.telegram.ui.Cells.j3 j3Var2 = yVar.f33001a0;
        qp qpVar = yVar.f33004d0;
        ci.d dVar = yVar.f33007g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (yVar.f33008h0 == null) {
                    yVar.T();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f33010j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = qpVar.f30140a.f24093q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f33010j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f33008h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = j3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = j3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f30901b;

                    {
                        this.f30901b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f30901b;
                                yVar2.f33007g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f33012l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c1.r(yVar2.f33006f0, d6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.P(this.f30901b, d6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = qpVar.f30140a.f24093q;
            createtone.emoji_id = yVar.f33008h0.longValue();
            createtone.title = j3Var2.getText().toString();
            createtone.prompt = j3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f30901b;

                {
                    this.f30901b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f30901b;
                            yVar2.f33007g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f33012l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.c1.r(yVar2.f33006f0, d6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.P(this.f30901b, d6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void P(y yVar, org.telegram.ui.ActionBar.d6 d6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f33006f0;
        yVar.f33007g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f33011k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(yVar.currentAccount, new yc(frameLayout, d6Var));
                return;
            }
            org.telegram.ui.Cells.c1.r(frameLayout, d6Var, tL_error, false);
        }
    }

    public static void Q(y yVar, org.telegram.ui.ActionBar.b2 b2Var) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f33010j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(yVar, g10, b2Var, 3));
    }

    public final void T() {
        if (this.f33009i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f33008h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f33009i0 = xVar;
        org.telegram.ui.t61[] t61VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        t61VarArr[0].b();
    }

    public final void U() {
        boolean z10;
        if (this.f33008h0 != null && this.f33001a0.getText().length() > 0 && this.f33002b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33007g0.setEnabled(z10);
    }

    public final void W() {
        Long l4 = this.f33008h0;
        w9 w9Var = this.Z;
        if (l4 == null) {
            w9Var.setImageResource(R.drawable.menu_smile_add);
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        w9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, this.f33008h0.longValue()));
        w9Var.setColorFilter(null);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20925j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f33005e0.setTranslationY(f7);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = u61Var;
        u61Var.f31306r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f33010j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
