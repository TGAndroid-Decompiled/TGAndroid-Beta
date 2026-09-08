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
public final class z extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final x9 Z;
    public final org.telegram.ui.Cells.i3 f33052a0;
    public final org.telegram.ui.Cells.i3 f33053b0;
    public final FrameLayout f33054c0;
    public final mp f33055d0;
    public final FrameLayout f33056e0;
    public final FrameLayout f33057f0;
    public final di.d f33058g0;
    public Long f33059h0;
    public y f33060i0;
    public TL_aicompose.TL_aiComposeTone f33061j0;
    public e f33062k0;
    public e f33063l0;
    public v51 m0;

    public z(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f24674e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z f30158b;

            {
                this.f30158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30158b.dismiss();
                        return;
                    case 1:
                        this.f30158b.V();
                        return;
                    default:
                        mp mpVar = this.f30158b.f33055d0;
                        mpVar.a(!mpVar.f28504a.f23934q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20690d6, f6Var)));
        w7.z5.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.x5.e(100, 100, 17));
        x9 x9Var = new x9(context);
        this.Z = x9Var;
        X();
        frameLayout2.addView(x9Var, w7.x5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z f30158b;

            {
                this.f30158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30158b.dismiss();
                        return;
                    case 1:
                        this.f30158b.V();
                        return;
                    default:
                        mp mpVar = this.f30158b.f33055d0;
                        mpVar.a(!mpVar.f28504a.f23934q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), f6Var);
        this.f33052a0 = i3Var;
        i3Var.f22101b.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f33053b0 = i3Var2;
        i3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        i3Var2.f22101b.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20780i6, f6Var), 24, 24));
        mp mpVar = new mp(context, 24, f6Var);
        this.f33055d0 = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.j6.f20763h7, org.telegram.ui.ActionBar.j6.f20799j7, org.telegram.ui.ActionBar.j6.f20819k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.f20924q5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z f30158b;

            {
                this.f30158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30158b.dismiss();
                        return;
                    case 1:
                        this.f30158b.V();
                        return;
                    default:
                        mp mpVar2 = this.f30158b.f33055d0;
                        mpVar2.a(!mpVar2.f28504a.f23934q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33054c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.x5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f20634a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        ll0 ll0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new bi.x5(8, this, f6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        w wVar = new w(this);
        wVar.f45805m = false;
        wVar.C = false;
        wVar.o(pr.h);
        wVar.n(350L);
        this.d.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33056e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 80);
        int i13 = e7.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e7.leftMargin = i13 + i14;
        e7.rightMargin += i14;
        this.containerView.addView(frameLayout4, e7);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f33057f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout5, d);
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.f33058g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.rf(9, this, f6Var));
        frameLayout4.addView(g10, w7.x5.e(-1, 48, 119));
        W();
        this.m0.N(false);
    }

    public static void P(z zVar, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var) {
        eVar.c(false);
        b2Var.dismiss();
        zVar.dismiss();
        MessagesController.getInstance(zVar.currentAccount).getTonesController().remove(zVar.f33061j0);
    }

    public static void Q(final z zVar, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.i3 i3Var = zVar.f33053b0;
        org.telegram.ui.Cells.i3 i3Var2 = zVar.f33052a0;
        mp mpVar = zVar.f33055d0;
        di.d dVar = zVar.f33058g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (zVar.f33059h0 == null) {
                    zVar.V();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (zVar.f33061j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = mpVar.f28504a.f23934q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f33061j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = zVar.f33059h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = i3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = i3Var.getText().toString();
                ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(zVar) {
                    public final z f30777b;

                    {
                        this.f30777b = zVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                z zVar2 = this.f30777b;
                                zVar2.f33058g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = zVar2.f33063l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    zVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.p6.q(zVar2.f33057f0, f6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                z.R(this.f30777b, f6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = mpVar.f28504a.f23934q;
            createtone.emoji_id = zVar.f33059h0.longValue();
            createtone.title = i3Var2.getText().toString();
            createtone.prompt = i3Var.getText().toString();
            ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(zVar) {
                public final z f30777b;

                {
                    this.f30777b = zVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            z zVar2 = this.f30777b;
                            zVar2.f33058g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = zVar2.f33063l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                zVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.p6.q(zVar2.f33057f0, f6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            z.R(this.f30777b, f6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void R(z zVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = zVar.f33057f0;
        zVar.f33058g0.setLoading(false);
        if (aiComposeTone != null) {
            zVar.dismiss();
            e eVar = zVar.f33062k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                f0.o0(zVar.currentAccount, new yc(frameLayout, f6Var));
                return;
            }
            org.telegram.ui.Cells.p6.q(frameLayout, f6Var, tL_error, false);
        }
    }

    public static void S(z zVar, org.telegram.ui.ActionBar.b2 b2Var) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f33061j0);
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(zVar, g10, b2Var, 3));
    }

    public final void V() {
        if (this.f33060i0 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        xVar.setSelected(this.f33059h0);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.f33060i0 = yVar;
        org.telegram.ui.a71[] a71VarArr = {yVar};
        yVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        a71VarArr[0].b();
    }

    public final void W() {
        boolean z10;
        if (this.f33059h0 != null && this.f33052a0.getText().length() > 0 && this.f33053b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33058g0.setEnabled(z10);
    }

    public final void X() {
        Long l4 = this.f33059h0;
        x9 x9Var = this.Z;
        if (l4 == null) {
            x9Var.setImageResource(R.drawable.menu_smile_add);
            x9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        x9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, this.f33059h0.longValue()));
        x9Var.setColorFilter(null);
        x9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20797j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f33056e0.setTranslationY(f7);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = v51Var;
        v51Var.f31162r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.f33061j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }
}
