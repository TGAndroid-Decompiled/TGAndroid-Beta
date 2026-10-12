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
public final class y extends db {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final z9 Z;
    public final org.telegram.ui.Cells.j3 f31429a0;
    public final org.telegram.ui.Cells.j3 f31430b0;
    public final FrameLayout f31431c0;
    public final aq f31432d0;
    public final FrameLayout f31433e0;
    public final FrameLayout f31434f0;
    public final di.d f31435g0;
    public Long f31436h0;
    public x f31437i0;
    public TL_aicompose.TL_aiComposeTone f31438j0;
    public e f31439k0;
    public e f31440l0;
    public z61 m0;

    public y(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, 2, c6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.a6.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.c6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f28703b;

            {
                this.f28703b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f28703b.dismiss();
                        return;
                    case 1:
                        this.f28703b.W();
                        return;
                    default:
                        aq aqVar = this.f28703b.f31432d0;
                        aqVar.a(!aqVar.f23604a.f23092q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var)));
        w7.c6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.a6.e(100, 100, 17));
        z9 z9Var = new z9(context);
        this.Z = z9Var;
        Y();
        frameLayout2.addView(z9Var, w7.a6.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f28703b;

            {
                this.f28703b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f28703b.dismiss();
                        return;
                    case 1:
                        this.f28703b.W();
                        return;
                    default:
                        aq aqVar = this.f28703b.f31432d0;
                        aqVar.a(!aqVar.f23604a.f23092q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), c6Var);
        this.f31429a0 = j3Var;
        j3Var.f21368b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.f31430b0 = j3Var2;
        j3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        j3Var2.f21368b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 24, 24));
        aq aqVar = new aq(context, 24, c6Var);
        this.f31432d0 = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.f19974h7, org.telegram.ui.ActionBar.g6.f20009j7, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(aqVar, w7.a6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.yh.n(org.telegram.ui.ActionBar.g6.f20138q5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f28703b;

            {
                this.f28703b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f28703b.dismiss();
                        return;
                    case 1:
                        this.f28703b.W();
                        return;
                    default:
                        aq aqVar2 = this.f28703b.f31432d0;
                        aqVar2.a(!aqVar2.f23604a.f23092q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31431c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.a6.a(-2.0f, 2.0f, 2.0f, 2.0f, 2.0f, -2, 17));
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new bi.z5(8, this, c6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f44872m = false;
        vVar.C = false;
        vVar.o(es.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f31433e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e = w7.a6.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f31434f0 = frameLayout5;
        FrameLayout.LayoutParams a2 = w7.a6.a(-2.0f, 6.0f, 0.0f, 6.0f, 60.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(frameLayout5, a2);
        di.d f7 = org.telegram.messenger.yh.f(24, context, c6Var, true);
        this.f31435g0 = f7;
        f7.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        f7.setOnClickListener(new org.telegram.ui.xf(9, this, c6Var));
        frameLayout4.addView(f7, w7.a6.e(-1, 48, 119));
        X();
        this.m0.N(false);
    }

    public static void Q(y yVar, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var) {
        cVar.c(false);
        a2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f31438j0);
    }

    public static void R(final y yVar, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.j3 j3Var = yVar.f31430b0;
        org.telegram.ui.Cells.j3 j3Var2 = yVar.f31429a0;
        aq aqVar = yVar.f31432d0;
        di.d dVar = yVar.f31435g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (yVar.f31436h0 == null) {
                    yVar.W();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f31438j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = aqVar.f23604a.f23092q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f31438j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f31436h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = j3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = j3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f29236b;

                    {
                        this.f29236b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f29236b;
                                yVar2.f31435g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f31440l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.d0.r(yVar2.f31434f0, c6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.S(this.f29236b, c6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = aqVar.f23604a.f23092q;
            createtone.emoji_id = yVar.f31436h0.longValue();
            createtone.title = j3Var2.getText().toString();
            createtone.prompt = j3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f29236b;

                {
                    this.f29236b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f29236b;
                            yVar2.f31435g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f31440l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.d0.r(yVar2.f31434f0, c6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.S(this.f29236b, c6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.c6 c6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f31434f0;
        yVar.f31435g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f31439k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.p0(yVar.currentAccount, new zc(frameLayout, c6Var));
                return;
            }
            org.telegram.ui.Cells.d0.r(frameLayout, c6Var, tL_error, false);
        }
    }

    public static void T(y yVar, org.telegram.ui.ActionBar.a2 a2Var) {
        pf.c g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f31438j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(yVar, g10, a2Var, 3));
    }

    @Override
    public final CharSequence A() {
        int i10;
        if (this.f31438j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }

    public final void W() {
        if (this.f31437i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f31436h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f31437i0 = xVar;
        org.telegram.ui.i71[] i71VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        i71VarArr[0].b();
    }

    public final void X() {
        boolean z10;
        if (this.f31436h0 != null && this.f31429a0.getText().length() > 0 && this.f31430b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31435g0.setEnabled(z10);
    }

    public final void Y() {
        Long l4 = this.f31436h0;
        z9 z9Var = this.Z;
        if (l4 == null) {
            z9Var.setImageResource(R.drawable.menu_smile_add);
            z9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        z9Var.setAnimatedEmojiDrawable(new s5(4, this.currentAccount, this.f31436h0.longValue()));
        z9Var.setColorFilter(null);
        z9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f31433e0.setTranslationY(f7);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
