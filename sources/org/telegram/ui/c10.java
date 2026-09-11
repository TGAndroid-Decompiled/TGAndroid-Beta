package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c10 extends pg.b {
    public final Context d;
    public final f10 f34972e;

    public c10(f10 f10Var, Context context) {
        this.f34972e = f10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34972e.P.size();
    }

    @Override
    public final int j(int i10) {
        w00 w00Var = (w00) this.f34972e.P.get(i10);
        if (w00Var == null) {
            return 3;
        }
        return w00Var.f44071a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        f10 f10Var = this.f34972e;
        ArrayList arrayList = f10Var.P;
        w00 w00Var = (w00) arrayList.get(i10);
        if (w00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((w00) arrayList.get(i14)).f44071a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f45742f;
            View view = c1Var.f45738a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(w00Var.d);
                                return;
                            case 7:
                                ((y00) view).e(w00Var.f41740m, z10);
                                return;
                            case 8:
                                m00 m00Var = (m00) view;
                                if (m00Var.f38532c != z10) {
                                    m00Var.f38532c = z10;
                                    m00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                t00 t00Var = (t00) view;
                                f10Var.I = t00Var;
                                t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.f36230w, -1, t00Var.f40580s.getPaint().getFontMetricsInt(), 0.5f), false);
                                t00 t00Var2 = f10Var.I;
                                if (f10Var.getUserConfig().isPremium()) {
                                    i16 = f10Var.E;
                                }
                                t00Var2.d(i16, false);
                                f10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                yp0 yp0Var = (yp0) view;
                                yp0Var.setCloseAsLock(!f10Var.getUserConfig().isPremium());
                                if (f10Var.getUserConfig().isPremium()) {
                                    i16 = f10Var.E;
                                }
                                yp0Var.a(i16, false);
                                yp0Var.setOnColorClick(new nf(26, this, yp0Var));
                                return;
                            case 11:
                                u00 u00Var = (u00) view;
                                f10Var.J = u00Var;
                                u00Var.setText(w00Var.d);
                                org.telegram.ui.Cells.t3 t3Var = u00Var.f40878r;
                                t3Var.setText(w00Var.f41733e);
                                t3Var.setOnClickListener(w00Var.f41732c);
                                return;
                            default:
                                return;
                        }
                    }
                    k00 k00Var = (k00) view;
                    boolean z12 = w00Var.f41739l;
                    ImageView imageView = k00Var.f37869a;
                    TextView textView = k00Var.f37870b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.j6.f20898q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20862o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.j6.f20880p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.j6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    int i17 = w00Var.f41738k;
                    CharSequence charSequence = w00Var.d;
                    ImageView imageView2 = k00Var.f37869a;
                    if (!LocaleController.isRTL) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f7 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f7);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i17 != 0) {
                        z11 = true;
                    }
                    Boolean bool = k00Var.f37872e;
                    if (bool == null || bool.booleanValue() != z11) {
                        k00Var.f37872e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (k00Var.f37871c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    k00Var.d = z10;
                    k00Var.setWillNotDraw(!z10);
                    k00Var.f37871c = i17;
                    return;
                }
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                String str = w00Var.f41736i;
                if (str != null) {
                    zaVar.e(str, w00Var.d, null, z10);
                    return;
                }
                long j3 = w00Var.h;
                if (j3 > 0) {
                    TLRPC.User user = f10Var.getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        zaVar.e(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = f10Var.getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        string = LocaleController.getString(R.string.Community);
                    } else if (chat.participants_count != 0) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                        } else {
                            string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                        }
                    } else if (!ChatObject.isPublic(chat)) {
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            string = LocaleController.getString(R.string.ChannelPrivate);
                        } else {
                            string = LocaleController.getString(R.string.MegaPrivate);
                        }
                    } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        string = LocaleController.getString(R.string.ChannelPublic);
                    } else {
                        string = LocaleController.getString(R.string.MegaPublic);
                    }
                    zaVar.e(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (w00Var.f41734f) {
                l4Var.setText(f10.x0(0, w00Var.d, false));
            } else {
                l4Var.setText(w00Var.d);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.za zaVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        Context context = this.d;
        f10 f10Var = this.f34972e;
        switch (i10) {
            case 0:
                zaVar = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.za zaVar2 = new org.telegram.ui.Cells.za(context, 6, 0, false);
                zaVar2.setSelfAsSavedMessages(true);
                zaVar = zaVar2;
                break;
            case 2:
                org.telegram.ui.Components.ov0 ov0Var = (org.telegram.ui.Components.ov0) f10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                ?? f3Var = new org.telegram.ui.Cells.f3(this.d, ov0Var, string, false, 12, f6Var);
                f10Var.K = f3Var;
                f3Var.f21904n = false;
                org.telegram.ui.Cells.d3 d3Var = f3Var.f21900b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(f10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(f10Var.f36230w);
                i11 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, f10Var.f36231x);
                org.telegram.ui.Components.zt editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new a10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                zaVar = f3Var;
                break;
            case 3:
                zaVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f37872e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f37869a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.x5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f37870b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                int i17 = 24;
                if (z10) {
                    i13 = 24;
                } else {
                    i13 = 0;
                }
                if (z10) {
                    i17 = 0;
                }
                textView.setPadding(i13, 0, i17, 0);
                if (LocaleController.isRTL) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 72.0f;
                }
                if (z11) {
                    f10 = 72.0f;
                } else {
                    f10 = 0.0f;
                }
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                zaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f41375a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                zaVar = frameLayout2;
                break;
            case 6:
            default:
                zaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                zaVar = new b10(this, this.d, f10Var, i14, f10Var.f36228r.f17080id);
                break;
            case 8:
                zaVar = new m00(context);
                break;
            case 9:
                zaVar = new t00(f10Var, context);
                break;
            case 10:
                Activity parentActivity = f10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                zaVar = new yp0(2, i15, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                zaVar = new u00(context, f6Var3);
                break;
        }
        return new s4.c1(zaVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 2 && i10 == 9) {
            f10 f10Var = this.f34972e;
            ((t00) c1Var.f45738a).e(org.telegram.ui.Components.z5.cloneSpans(f10Var.f36230w, -1, f10Var.I.f40580s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f45742f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) c1Var.f45738a;
            f3Var.f21900b.k(true);
            f3Var.f21900b.d();
        }
    }
}
