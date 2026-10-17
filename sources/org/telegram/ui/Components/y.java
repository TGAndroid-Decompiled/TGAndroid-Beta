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
public final class y extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final w9 Z;
    public final org.telegram.ui.Cells.i3 f32482a0;
    public final org.telegram.ui.Cells.i3 f32483b0;
    public final FrameLayout f32484c0;
    public final xp f32485d0;
    public final FrameLayout f32486e0;
    public final FrameLayout f32487f0;
    public final ei.d f32488g0;
    public Long f32489h0;
    public x f32490i0;
    public TL_aicompose.TL_aiComposeTone f32491j0;
    public e f32492k0;
    public e f32493l0;
    public s61 m0;

    public y(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, true, false, 2, d6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.z5.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f29782b;

            {
                this.f29782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29782b.dismiss();
                        return;
                    case 1:
                        this.f29782b.W();
                        return;
                    default:
                        xp xpVar = this.f29782b.f32485d0;
                        xpVar.a(!xpVar.f32428a.f24147q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var)));
        w7.b6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.z5.e(100, 100, 17));
        w9 w9Var = new w9(context);
        this.Z = w9Var;
        Y();
        frameLayout2.addView(w9Var, w7.z5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f29782b;

            {
                this.f29782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29782b.dismiss();
                        return;
                    case 1:
                        this.f29782b.W();
                        return;
                    default:
                        xp xpVar = this.f29782b.f32485d0;
                        xpVar.a(!xpVar.f32428a.f24147q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), d6Var);
        this.f32482a0 = i3Var;
        i3Var.f22401b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), d6Var);
        this.f32483b0 = i3Var2;
        i3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        i3Var2.f22401b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var), 24, 24));
        xp xpVar = new xp(context, 24, d6Var);
        this.f32485d0 = xpVar;
        xpVar.b(org.telegram.ui.ActionBar.h6.f21059h7, org.telegram.ui.ActionBar.h6.f21094j7, org.telegram.ui.ActionBar.h6.f21114k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(false, false);
        xpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.wh.o(org.telegram.ui.ActionBar.h6.f21223q5, d6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f29782b;

            {
                this.f29782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29782b.dismiss();
                        return;
                    case 1:
                        this.f29782b.W();
                        return;
                    default:
                        xp xpVar2 = this.f29782b.f32485d0;
                        xpVar2.a(!xpVar2.f32428a.f24147q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32484c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.z5.a(-2.0f, 2.0f, 2.0f, 2.0f, 2.0f, -2, 17));
        int i11 = org.telegram.ui.ActionBar.h6.f20928a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        im0 im0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        im0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new ci.y4(8, this, d6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f45972m = false;
        vVar.C = false;
        vVar.o(bs.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f32486e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f32487f0 = frameLayout5;
        FrameLayout.LayoutParams a2 = w7.z5.a(-2.0f, 6.0f, 0.0f, 6.0f, 60.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(frameLayout5, a2);
        ei.d f7 = org.telegram.messenger.wh.f(24, context, d6Var, true);
        this.f32488g0 = f7;
        f7.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        f7.setOnClickListener(new org.telegram.ui.ActionBar.s1(19, this, d6Var));
        frameLayout4.addView(f7, w7.z5.e(-1, 48, 119));
        X();
        this.m0.N(false);
    }

    public static void Q(y yVar, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var) {
        cVar.c(false);
        b2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f32491j0);
    }

    public static void R(final y yVar, final org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.Cells.i3 i3Var = yVar.f32483b0;
        org.telegram.ui.Cells.i3 i3Var2 = yVar.f32482a0;
        xp xpVar = yVar.f32485d0;
        ei.d dVar = yVar.f32488g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (yVar.f32489h0 == null) {
                    yVar.W();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f32491j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = xpVar.f32428a.f24147q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f32491j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f32489h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = i3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = i3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f30414b;

                    {
                        this.f30414b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f30414b;
                                yVar2.f32488g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f32493l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.t0.t(yVar2.f32487f0, d6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.S(this.f30414b, d6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = xpVar.f32428a.f24147q;
            createtone.emoji_id = yVar.f32489h0.longValue();
            createtone.title = i3Var2.getText().toString();
            createtone.prompt = i3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f30414b;

                {
                    this.f30414b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f30414b;
                            yVar2.f32488g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f32493l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.t0.t(yVar2.f32487f0, d6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.S(this.f30414b, d6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.d6 d6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f32487f0;
        yVar.f32488g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f32492k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.p0(yVar.currentAccount, new xc(frameLayout, d6Var));
                return;
            }
            org.telegram.ui.Cells.t0.t(frameLayout, d6Var, tL_error, false);
        }
    }

    public static void T(y yVar, org.telegram.ui.ActionBar.b2 b2Var) {
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f32491j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new ai.s0(yVar, g10, b2Var, 5));
    }

    @Override
    public final CharSequence A() {
        int i10;
        if (this.f32491j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }

    public final void W() {
        if (this.f32490i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f32489h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f32490i0 = xVar;
        org.telegram.ui.q51[] q51VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        q51VarArr[0].b();
    }

    public final void X() {
        boolean z10;
        if (this.f32489h0 != null && this.f32482a0.getText().length() > 0 && this.f32483b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32488g0.setEnabled(z10);
    }

    public final void Y() {
        Long l4 = this.f32489h0;
        w9 w9Var = this.Z;
        if (l4 == null) {
            w9Var.setImageResource(R.drawable.menu_smile_add);
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        w9Var.setAnimatedEmojiDrawable(new r5(4, this.currentAccount, this.f32489h0.longValue()));
        w9Var.setColorFilter(null);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f32486e0.setTranslationY(f7);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(im0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = s61Var;
        s61Var.f30200r = false;
        return s61Var;
    }
}
