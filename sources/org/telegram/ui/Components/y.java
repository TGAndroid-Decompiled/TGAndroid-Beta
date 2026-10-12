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
    public final y9 Z;
    public final org.telegram.ui.Cells.j3 f32889a0;
    public final org.telegram.ui.Cells.j3 f32890b0;
    public final FrameLayout f32891c0;
    public final fq f32892d0;
    public final FrameLayout f32893e0;
    public final FrameLayout f32894f0;
    public final ci.d f32895g0;
    public Long f32896h0;
    public x f32897i0;
    public TL_aicompose.TL_aiComposeTone f32898j0;
    public e f32899k0;
    public e f32900l0;
    public h71 m0;

    public y(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, 2, c6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.f25287e.addView(imageView, w7.w5.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.y5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f29957b;

            {
                this.f29957b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29957b.dismiss();
                        return;
                    case 1:
                        this.f29957b.W();
                        return;
                    default:
                        fq fqVar = this.f29957b.f32892d0;
                        fqVar.a(!fqVar.f26152a.f23875q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var)));
        w7.y5.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.w5.e(100, 100, 17));
        y9 y9Var = new y9(context);
        this.Z = y9Var;
        Y();
        frameLayout2.addView(y9Var, w7.w5.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f29957b;

            {
                this.f29957b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29957b.dismiss();
                        return;
                    case 1:
                        this.f29957b.W();
                        return;
                    default:
                        fq fqVar = this.f29957b.f32892d0;
                        fqVar.a(!fqVar.f26152a.f23875q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), c6Var);
        this.f32889a0 = j3Var;
        j3Var.f22081b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.f32890b0 = j3Var2;
        j3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        j3Var2.f22081b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), 24, 24));
        fq fqVar = new fq(context, 24, c6Var);
        this.f32892d0 = fqVar;
        fqVar.b(org.telegram.ui.ActionBar.h6.f20633h7, org.telegram.ui.ActionBar.h6.f20670j7, org.telegram.ui.ActionBar.h6.f20689k7);
        fqVar.setDrawUnchecked(true);
        fqVar.a(false, false);
        fqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(fqVar, w7.w5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.f20799q5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.w5.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f29957b;

            {
                this.f29957b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29957b.dismiss();
                        return;
                    case 1:
                        this.f29957b.W();
                        return;
                    default:
                        fq fqVar2 = this.f29957b.f32892d0;
                        fqVar2.a(!fqVar2.f26152a.f23875q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32891c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.w5.a(-2.0f, 2.0f, 2.0f, 2.0f, 2.0f, -2, 17));
        int i11 = org.telegram.ui.ActionBar.h6.f20504a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        wm0 wm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new ai.o6(8, this, c6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.f47937m = false;
        vVar.C = false;
        vVar.o(js.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f32893e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e7 = w7.w5.e(-1, -2, 80);
        int i13 = e7.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e7.leftMargin = i13 + i14;
        e7.rightMargin += i14;
        this.containerView.addView(frameLayout4, e7);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f32894f0 = frameLayout5;
        FrameLayout.LayoutParams a2 = w7.w5.a(-2.0f, 6.0f, 0.0f, 6.0f, 60.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(frameLayout5, a2);
        ci.d f7 = org.telegram.messenger.am.f(24, context, c6Var, true);
        this.f32895g0 = f7;
        f7.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        f7.setOnClickListener(new org.telegram.ui.wf(9, this, c6Var));
        frameLayout4.addView(f7, w7.w5.e(-1, 48, 119));
        X();
        this.m0.N(false);
    }

    public static void Q(y yVar, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var) {
        eVar.c(false);
        a2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f32898j0);
    }

    public static void R(final y yVar, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.j3 j3Var = yVar.f32890b0;
        org.telegram.ui.Cells.j3 j3Var2 = yVar.f32889a0;
        fq fqVar = yVar.f32892d0;
        ci.d dVar = yVar.f32895g0;
        if (!dVar.N) {
            if (!dVar.W) {
                if (yVar.f32896h0 == null) {
                    yVar.W();
                    return;
                }
                return;
            }
            dVar.setLoading(true);
            if (yVar.f32898j0 != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = fqVar.f26152a.f23875q;
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f32898j0);
                updatetone.flags |= 2;
                updatetone.emoji_id = yVar.f32896h0.longValue();
                updatetone.flags |= 4;
                updatetone.title = j3Var2.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = j3Var.getText().toString();
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new Object(), new Utilities.Callback2(yVar) {
                    public final y f30710b;

                    {
                        this.f30710b = yVar;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (r3) {
                            case 0:
                                y yVar2 = this.f30710b;
                                yVar2.f32895g0.setLoading(false);
                                if (aiComposeTone != null) {
                                    e eVar = yVar2.f32900l0;
                                    if (eVar != null) {
                                        eVar.run(aiComposeTone);
                                    }
                                    yVar2.dismiss();
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c1.p(yVar2.f32894f0, c6Var, tL_error, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                y.S(this.f30710b, c6Var, aiComposeTone, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = fqVar.f26152a.f23875q;
            createtone.emoji_id = yVar.f32896h0.longValue();
            createtone.title = j3Var2.getText().toString();
            createtone.prompt = j3Var.getText().toString();
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new Object(), new Utilities.Callback2(yVar) {
                public final y f30710b;

                {
                    this.f30710b = yVar;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (r3) {
                        case 0:
                            y yVar2 = this.f30710b;
                            yVar2.f32895g0.setLoading(false);
                            if (aiComposeTone != null) {
                                e eVar = yVar2.f32900l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                return;
                            } else if (tL_error != null) {
                                org.telegram.ui.Cells.c1.p(yVar2.f32894f0, c6Var, tL_error, false);
                                return;
                            } else {
                                return;
                            }
                        default:
                            y.S(this.f30710b, c6Var, aiComposeTone, tL_error);
                            return;
                    }
                }
            });
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.c6 c6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f32894f0;
        yVar.f32895g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.f32899k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
            }
        } else if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.p0(yVar.currentAccount, new zc(frameLayout, c6Var));
                return;
            }
            org.telegram.ui.Cells.c1.p(frameLayout, c6Var, tL_error, false);
        }
    }

    public static void T(y yVar, org.telegram.ui.ActionBar.a2 a2Var) {
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f32898j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(yVar, g10, a2Var, 3));
    }

    @Override
    public final CharSequence A() {
        int i10;
        if (this.f32898j0 != null) {
            i10 = R.string.AIEditorEditStyle;
        } else {
            i10 = R.string.AIEditorNewStyle;
        }
        return LocaleController.getString(i10);
    }

    public final void W() {
        if (this.f32897i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.f32896h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f32897i0 = xVar;
        org.telegram.ui.e71[] e71VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        e71VarArr[0].b();
    }

    public final void X() {
        boolean z10;
        if (this.f32896h0 != null && this.f32889a0.getText().length() > 0 && this.f32890b0.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32895g0.setEnabled(z10);
    }

    public final void Y() {
        Long l4 = this.f32896h0;
        y9 y9Var = this.Z;
        if (l4 == null) {
            y9Var.setImageResource(R.drawable.menu_smile_add);
            y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            return;
        }
        y9Var.setAnimatedEmojiDrawable(new s5(4, this.currentAccount, this.f32896h0.longValue()));
        y9Var.setColorFilter(null);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f32893e0.setTranslationY(f7);
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }
}
