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
public final class z extends sa {
    public final FrameLayout U;
    public final FrameLayout V;
    public final p9 W;
    public final org.telegram.ui.Cells.i3 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final FrameLayout Z;
    public final np f33654a0;
    public final FrameLayout f33655b0;
    public final FrameLayout f33656c0;
    public final qh.d f33657d0;
    public Long f33658e0;
    public y f33659f0;
    public TL_aicompose.TL_aiComposeTone f33660g0;
    public e f33661h0;
    public e f33662i0;
    public x51 f33663j0;

    public z(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, false, false, false, 2, g6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f31015e.addView(imageView, k7.c6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z f30913b;

            {
                this.f30913b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30913b.dismiss();
                        return;
                    case 1:
                        this.f30913b.V();
                        return;
                    default:
                        np npVar = this.f30913b.f33654a0;
                        npVar.a(!npVar.f29606a.f24809q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var)));
        k7.e6.a(frameLayout2);
        frameLayout.addView(frameLayout2, k7.c6.e(100, 100, 17));
        p9 p9Var = new p9(context);
        this.W = p9Var;
        X();
        frameLayout2.addView(p9Var, k7.c6.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z f30913b;

            {
                this.f30913b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30913b.dismiss();
                        return;
                    case 1:
                        this.f30913b.V();
                        return;
                    default:
                        np npVar = this.f30913b.f33654a0;
                        npVar.a(!npVar.f29606a.f24809q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), g6Var);
        this.X = i3Var;
        i3Var.f22955b.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), g6Var);
        this.Y = i3Var2;
        i3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        i3Var2.f22955b.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 24, 24));
        np npVar = new np(context, 24, g6Var);
        this.f33654a0 = npVar;
        npVar.b(org.telegram.ui.ActionBar.k6.f21733h7, org.telegram.ui.ActionBar.k6.f21768j7, org.telegram.ui.ActionBar.k6.f21786k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(npVar, k7.c6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21893q5, g6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, k7.c6.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z f30913b;

            {
                this.f30913b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30913b.dismiss();
                        return;
                    case 1:
                        this.f30913b.V();
                        return;
                    default:
                        np npVar2 = this.f30913b.f33654a0;
                        npVar2.a(!npVar2.f29606a.f24809q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.addView(linearLayout, k7.c6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        tl0 tl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new hg.v0(8, this, g6Var));
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.L = true;
        w wVar = new w(this);
        wVar.f5910m = false;
        wVar.C = false;
        wVar.o(pr.h);
        wVar.n(350L);
        this.d.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33655b0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e6 = k7.c6.e(-1, -2, 80);
        int i13 = e6.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e6.leftMargin = i13 + i14;
        e6.rightMargin += i14;
        this.containerView.addView(frameLayout4, e6);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f33656c0 = frameLayout5;
        FrameLayout.LayoutParams d = k7.c6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout5, d);
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.f33657d0 = p10;
        p10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        p10.setOnClickListener(new org.telegram.messenger.video.g(24, this, g6Var));
        frameLayout4.addView(p10, k7.c6.e(-1, 48, 119));
        W();
        this.f33663j0.N(false);
    }

    public static void P(z zVar, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var) {
        fVar.c(false);
        d2Var.dismiss();
        zVar.dismiss();
        MessagesController.getInstance(zVar.currentAccount).getTonesController().remove(zVar.f33660g0);
    }

    public static void Q(final z zVar, final org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.i3 i3Var = zVar.Y;
        org.telegram.ui.Cells.i3 i3Var2 = zVar.X;
        np npVar = zVar.f33654a0;
        qh.d dVar = zVar.f33657d0;
        if (!dVar.K) {
            if (!dVar.T) {
                if (zVar.f33658e0 == null) {
                    zVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (zVar.f33660g0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = npVar.f29606a.f24809q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f33660g0);
                updatetone.flags |= 2;
                updatetone.emoji_id = zVar.f33658e0.longValue();
                updatetone.flags |= 4;
                updatetone.title = i3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = i3Var.getText().toString();
                ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(zVar) {
                    public final z f31496b;

                    {
                        this.f31496b = zVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                z zVar2 = this.f31496b;
                                zVar2.f33657d0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = zVar2.f33662i0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    zVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.yh.u(zVar2.f33656c0, g6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                z.R(this.f31496b, g6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = npVar.f29606a.f24809q;
            createtone.emoji_id = zVar.f33658e0.longValue();
            createtone.title = i3Var2.getText().toString();
            createtone.prompt = i3Var.getText().toString();
            ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(zVar) {
                public final z f31496b;

                {
                    this.f31496b = zVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            z zVar2 = this.f31496b;
                            zVar2.f33657d0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = zVar2.f33662i0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                zVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.yh.u(zVar2.f33656c0, g6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            z.R(this.f31496b, g6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(z zVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = zVar.f33656c0;
        zVar.f33657d0.setLoading(false);
        if (aiComposeTone != null) {
            zVar.dismiss();
            e eVar = zVar.f33661h0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                f0.o0(zVar.currentAccount, new qc(frameLayout, g6Var));
                return;
            }
            org.telegram.ui.yh.u(frameLayout, g6Var, tL_error, false);
        }
    }

    public static void S(z zVar, org.telegram.ui.ActionBar.d2 d2Var) {
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f33660g0);
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(deletetone, new Object(), new lh.a0(zVar, g10, d2Var, 7));
    }

    public final void V() {
        if (this.f33659f0 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        xVar.setSelected(this.f33658e0);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.f33659f0 = yVar;
        org.telegram.ui.i61[] i61VarArr = {yVar};
        yVar.showAsDropDown(this.V, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        i61VarArr[0].b();
    }

    public final void W() {
        boolean z4;
        if (this.f33658e0 != null && this.X.getText().length() > 0 && this.Y.getText().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f33657d0.setEnabled(z4);
    }

    public final void X() {
        Long l10 = this.f33658e0;
        p9 p9Var = this.W;
        if (l10 == null) {
            p9Var.setImageResource(R.drawable.menu_smile_add);
            p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        p9Var.setAnimatedEmojiDrawable(new l5(4, this.currentAccount, this.f33658e0.longValue()));
        p9Var.setColorFilter(null);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.f33655b0.setTranslationY(f10);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.f33663j0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f33660g0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
