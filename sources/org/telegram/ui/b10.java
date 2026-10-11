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
public final class b10 extends og.b {
    public final Context d;
    public final e10 f36271e;

    public b10(e10 e10Var, Context context) {
        this.f36271e = e10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36271e.P.size();
    }

    @Override
    public final int j(int i10) {
        v00 v00Var = (v00) this.f36271e.P.get(i10);
        if (v00Var == null) {
            return 3;
        }
        return v00Var.f17211a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        e10 e10Var = this.f36271e;
        ArrayList arrayList = e10Var.P;
        v00 v00Var = (v00) arrayList.get(i10);
        if (v00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((v00) arrayList.get(i14)).f17211a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = d1Var.f47786f;
            View view = d1Var.f47782a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(v00Var.d);
                                return;
                            case 7:
                                ((x00) view).e(v00Var.f42855m, z10);
                                return;
                            case 8:
                                l00 l00Var = (l00) view;
                                if (l00Var.f39500c != z10) {
                                    l00Var.f39500c = z10;
                                    l00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                s00 s00Var = (s00) view;
                                e10Var.I = s00Var;
                                s00Var.e(org.telegram.ui.Components.b6.cloneSpans(e10Var.f37211w, -1, s00Var.f41583s.getPaint().getFontMetricsInt(), 0.5f), false);
                                s00 s00Var2 = e10Var.I;
                                if (e10Var.getUserConfig().isPremium()) {
                                    i16 = e10Var.E;
                                }
                                s00Var2.d(i16, false);
                                e10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                wp0 wp0Var = (wp0) view;
                                wp0Var.setCloseAsLock(!e10Var.getUserConfig().isPremium());
                                if (e10Var.getUserConfig().isPremium()) {
                                    i16 = e10Var.E;
                                }
                                wp0Var.a(i16, false);
                                wp0Var.setOnColorClick(new et(3, this, wp0Var));
                                return;
                            case 11:
                                t00 t00Var = (t00) view;
                                e10Var.J = t00Var;
                                t00Var.setText(v00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = t00Var.f42057r;
                                u3Var.setText(v00Var.f42848e);
                                u3Var.setOnClickListener(v00Var.f42847c);
                                return;
                            default:
                                return;
                        }
                    }
                    j00 j00Var = (j00) view;
                    boolean z12 = v00Var.f42854l;
                    ImageView imageView = j00Var.f38841a;
                    TextView textView = j00Var.f38842b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.h6.f21062q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21025o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.h6.f21043p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.h6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    int i17 = v00Var.f42853k;
                    CharSequence charSequence = v00Var.d;
                    ImageView imageView2 = j00Var.f38841a;
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
                    Boolean bool = j00Var.f38844e;
                    if (bool == null || bool.booleanValue() != z11) {
                        j00Var.f38844e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (j00Var.f38843c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.is.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    j00Var.d = z10;
                    j00Var.setWillNotDraw(!z10);
                    j00Var.f38843c = i17;
                    return;
                }
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                String str = v00Var.f42851i;
                if (str != null) {
                    xaVar.d(str, v00Var.d, null, z10);
                    return;
                }
                long j3 = v00Var.h;
                if (j3 > 0) {
                    TLRPC.User user = e10Var.getMessagesController().getUser(Long.valueOf(j3));
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
                TLRPC.Chat chat = e10Var.getMessagesController().getChat(Long.valueOf(-j3));
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
            if (v00Var.f42849f) {
                m4Var.setText(e10.x0(0, v00Var.d, false));
            } else {
                m4Var.setText(v00Var.d);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.xa xaVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        Context context = this.d;
        e10 e10Var = this.f36271e;
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
                org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) e10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.m2) e10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, tw0Var, string, false, 12, d6Var);
                e10Var.K = g3Var;
                g3Var.f22146n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f22142b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(e10Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(e10Var.f37211w);
                i11 = ((org.telegram.ui.ActionBar.m2) e10Var).currentAccount;
                org.telegram.ui.Components.s5.s(i11, e10Var.f37212x);
                org.telegram.ui.Components.su editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new z00(this));
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
                frameLayout.f38844e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f38841a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.x5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
                TextView textView = new TextView(context);
                frameLayout.f38842b = textView;
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
                frameLayout2.f42337a = imageView2;
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
                i14 = ((org.telegram.ui.ActionBar.m2) e10Var).currentAccount;
                xaVar = new a10(this, this.d, e10Var, i14, e10Var.f37209r.f17287id);
                break;
            case 8:
                xaVar = new l00(context);
                break;
            case 9:
                xaVar = new s00(e10Var, context);
                break;
            case 10:
                Activity parentActivity = e10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.m2) e10Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.m2) e10Var).resourceProvider;
                xaVar = new wp0(2, i15, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.m2) e10Var).resourceProvider;
                xaVar = new t00(context, d6Var3);
                break;
        }
        return new s4.d1(xaVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 2 && i10 == 9) {
            e10 e10Var = this.f36271e;
            ((s00) d1Var.f47782a).e(org.telegram.ui.Components.b6.cloneSpans(e10Var.f37211w, -1, e10Var.I.f41583s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        if (d1Var.f47786f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) d1Var.f47782a;
            g3Var.f22142b.k(true);
            g3Var.f22142b.d();
        }
    }
}
