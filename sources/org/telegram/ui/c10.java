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
public final class c10 extends og.b {
    public final Context d;
    public final f10 f36491e;

    public c10(f10 f10Var, Context context) {
        this.f36491e = f10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36491e.P.size();
    }

    @Override
    public final int j(int i10) {
        w00 w00Var = (w00) this.f36491e.P.get(i10);
        if (w00Var == null) {
            return 3;
        }
        return w00Var.f17125a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        f10 f10Var = this.f36491e;
        ArrayList arrayList = f10Var.P;
        w00 w00Var = (w00) arrayList.get(i10);
        if (w00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((w00) arrayList.get(i14)).f17125a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = d1Var.f47660f;
            View view = d1Var.f47656a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(w00Var.d);
                                return;
                            case 7:
                                ((y00) view).e(w00Var.f43033m, z10);
                                return;
                            case 8:
                                m00 m00Var = (m00) view;
                                if (m00Var.f39720c != z10) {
                                    m00Var.f39720c = z10;
                                    m00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                t00 t00Var = (t00) view;
                                f10Var.I = t00Var;
                                t00Var.e(org.telegram.ui.Components.b6.cloneSpans(f10Var.f37418w, -1, t00Var.f41807s.getPaint().getFontMetricsInt(), 0.5f), false);
                                t00 t00Var2 = f10Var.I;
                                if (f10Var.getUserConfig().isPremium()) {
                                    i16 = f10Var.E;
                                }
                                t00Var2.d(i16, false);
                                f10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                xp0 xp0Var = (xp0) view;
                                xp0Var.setCloseAsLock(!f10Var.getUserConfig().isPremium());
                                if (f10Var.getUserConfig().isPremium()) {
                                    i16 = f10Var.E;
                                }
                                xp0Var.a(i16, false);
                                xp0Var.setOnColorClick(new ft(3, this, xp0Var));
                                return;
                            case 11:
                                u00 u00Var = (u00) view;
                                f10Var.J = u00Var;
                                u00Var.setText(w00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = u00Var.f42288r;
                                u3Var.setText(w00Var.f43026e);
                                u3Var.setOnClickListener(w00Var.f43025c);
                                return;
                            default:
                                return;
                        }
                    }
                    k00 k00Var = (k00) view;
                    boolean z12 = w00Var.f43032l;
                    ImageView imageView = k00Var.f39047a;
                    TextView textView = k00Var.f39048b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.i6.f21037q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.i6.f21000o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.i6.f21018p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.i6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    int i17 = w00Var.f43031k;
                    CharSequence charSequence = w00Var.d;
                    ImageView imageView2 = k00Var.f39047a;
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
                    Boolean bool = k00Var.f39050e;
                    if (bool == null || bool.booleanValue() != z11) {
                        k00Var.f39050e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (k00Var.f39049c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    k00Var.d = z10;
                    k00Var.setWillNotDraw(!z10);
                    k00Var.f39049c = i17;
                    return;
                }
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                String str = w00Var.f43029i;
                if (str != null) {
                    xaVar.d(str, w00Var.d, null, z10);
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
                        xaVar.d(user, null, string2, z10);
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
                    xaVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (w00Var.f43027f) {
                m4Var.setText(f10.x0(0, w00Var.d, false));
            } else {
                m4Var.setText(w00Var.d);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.xa xaVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.d;
        f10 f10Var = this.f36491e;
        switch (i10) {
            case 0:
                xaVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.xa xaVar2 = new org.telegram.ui.Cells.xa(6, 0, context, false);
                xaVar2.setSelfAsSavedMessages(true);
                xaVar = xaVar2;
                break;
            case 2:
                org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) f10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                e6Var = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, sw0Var, string, false, 12, e6Var);
                f10Var.K = g3Var;
                g3Var.f22118n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f22114b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(f10Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(f10Var.f37418w);
                i11 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                org.telegram.ui.Components.s5.s(i11, f10Var.f37419x);
                org.telegram.ui.Components.ru editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new a10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                xaVar = g3Var;
                break;
            case 3:
                xaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f39050e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f39047a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.x5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
                TextView textView = new TextView(context);
                frameLayout.f39048b = textView;
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
                frameLayout.addView(textView, w7.x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
                xaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f42591a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 17));
                imageView2.setOnClickListener(new a(frameLayout2, 23));
                xaVar = frameLayout2;
                break;
            case 6:
            default:
                xaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                xaVar = new b10(this, this.d, f10Var, i14, f10Var.f37416r.f17252id);
                break;
            case 8:
                xaVar = new m00(context);
                break;
            case 9:
                xaVar = new t00(f10Var, context);
                break;
            case 10:
                Activity parentActivity = f10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                xaVar = new xp0(2, i15, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                xaVar = new u00(context, e6Var3);
                break;
        }
        return new s4.d1(xaVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 != 2 && i10 == 9) {
            f10 f10Var = this.f36491e;
            ((t00) d1Var.f47656a).e(org.telegram.ui.Components.b6.cloneSpans(f10Var.f37418w, -1, f10Var.I.f41807s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        if (d1Var.f47660f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) d1Var.f47656a;
            g3Var.f22114b.k(true);
            g3Var.f22114b.d();
        }
    }
}
