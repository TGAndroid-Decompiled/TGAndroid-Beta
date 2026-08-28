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
public final class y extends sa {
    public final FrameLayout T;
    public final FrameLayout U;
    public final o9 V;
    public final org.telegram.ui.Cells.j3 W;
    public final org.telegram.ui.Cells.j3 X;
    public final FrameLayout Y;
    public final dp Z;
    public final FrameLayout f34810a0;
    public final FrameLayout f34811b0;
    public final kh.d f34812c0;
    public Long f34813d0;
    public x f34814e0;
    public TL_aicompose.TL_aiComposeTone f34815f0;
    public e f34816g0;
    public e f34817h0;
    public z41 f34818i0;

    public y(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, false, false, 2, b6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(getThemedColor(i9));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i9)), 1, -1));
        this.f32408e.addView(imageView, g7.e6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        g7.g6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f32043b;

            {
                this.f32043b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32043b.dismiss();
                        return;
                    case 1:
                        this.f32043b.U();
                        return;
                    default:
                        dp dpVar = this.f32043b.Z;
                        dpVar.a(!dpVar.f27781a.f26313q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var)));
        g7.g6.a(frameLayout2);
        frameLayout.addView(frameLayout2, g7.e6.e(100, 100, 17));
        o9 o9Var = new o9(context);
        this.V = o9Var;
        W();
        frameLayout2.addView(o9Var, g7.e6.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f32043b;

            {
                this.f32043b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32043b.dismiss();
                        return;
                    case 1:
                        this.f32043b.U();
                        return;
                    default:
                        dp dpVar = this.f32043b.Z;
                        dpVar.a(!dpVar.f27781a.f26313q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), b6Var);
        this.W = j3Var;
        j3Var.f24544b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), b6Var);
        this.X = j3Var2;
        j3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        j3Var2.f24544b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 24, 24));
        dp dpVar = new dp(context, 24, b6Var);
        this.Z = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.f23074h7, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(false, false);
        dpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(dpVar, g7.e6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23228q5, b6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f32043b;

            {
                this.f32043b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32043b.dismiss();
                        return;
                    case 1:
                        this.f32043b.U();
                        return;
                    default:
                        dp dpVar2 = this.f32043b.Z;
                        dpVar2.a(!dpVar2.f27781a.f26313q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y = frameLayout3;
        frameLayout3.addView(linearLayout, g7.e6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        this.behindKeyboardColorKey = i10;
        setBackgroundColor(getThemedColor(i10));
        wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new bg.b1(10, this, b6Var));
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.K = true;
        v vVar = new v(this);
        vVar.f5532m = false;
        vVar.C = false;
        vVar.o(gr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34810a0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.containerView.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f34811b0 = frameLayout5;
        FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(frameLayout5, d);
        kh.d i16 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.f34812c0 = i16;
        i16.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        i16.setOnClickListener(new mh.k3(26, this, b6Var));
        frameLayout4.addView(i16, g7.e6.e(-1, 48, 119));
        V();
        this.f34818i0.N(false);
    }

    public static void O(y yVar, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var) {
        dVar.c(false);
        c2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f34815f0);
    }

    public static void P(final y yVar, final org.telegram.ui.ActionBar.b6 b6Var) {
        org.telegram.ui.Cells.j3 j3Var = yVar.X;
        org.telegram.ui.Cells.j3 j3Var2 = yVar.W;
        dp dpVar = yVar.Z;
        kh.d dVar = yVar.f34812c0;
        if (!dVar.J) {
            if (!dVar.S) {
                if (yVar.f34813d0 == null) {
                    yVar.U();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f34815f0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = dpVar.f27781a.f26313q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f34815f0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f34813d0.longValue();
                updatetone.flags |= 4;
                updatetone.title = j3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = j3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f32579b;

                    {
                        this.f32579b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f32579b;
                                yVar2.f34812c0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f34817h0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.j2.s(yVar2.f34811b0, b6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.Q(this.f32579b, b6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = dpVar.f27781a.f26313q;
            createtone.emoji_id = yVar.f34813d0.longValue();
            createtone.title = j3Var2.getText().toString();
            createtone.prompt = j3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f32579b;

                {
                    this.f32579b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f32579b;
                            yVar2.f34812c0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f34817h0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.j2.s(yVar2.f34811b0, b6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.Q(this.f32579b, b6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void Q(y yVar, org.telegram.ui.ActionBar.b6 b6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f34811b0;
        yVar.f34812c0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f34816g0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.n0(yVar.currentAccount, new oc(frameLayout, b6Var));
                return;
            }
            org.telegram.ui.Cells.j2.s(frameLayout, b6Var, tL_error, false);
        }
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.c2 c2Var) {
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f34815f0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new fh.f0(yVar, g10, c2Var, 7));
    }

    public final void U() {
        if (this.f34814e0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f34813d0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f34814e0 = xVar;
        org.telegram.ui.s51[] s51VarArr = {xVar};
        xVar.showAsDropDown(this.U, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        s51VarArr[0].b();
    }

    public final void V() {
        boolean z10;
        if (this.f34813d0 != null && this.W.getText().length() > 0 && this.X.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34812c0.setEnabled(z10);
    }

    public final void W() {
        Long l10 = this.f34813d0;
        o9 o9Var = this.V;
        if (l10 == null) {
            o9Var.setImageResource(R.drawable.menu_smile_add);
            o9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        o9Var.setAnimatedEmojiDrawable(new k5(4, this.currentAccount, this.f34813d0.longValue()));
        o9Var.setColorFilter(null);
        o9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.f34810a0.setTranslationY(f10);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.f34818i0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        int i9;
        if (this.f34815f0 != null) {
            i9 = R.string.AIEditorEditStyle;
        } else {
            i9 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i9);
    }
}
