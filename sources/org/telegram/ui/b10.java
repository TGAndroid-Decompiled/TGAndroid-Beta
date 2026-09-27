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
    public final e10 e;

    public b10(e10 e10Var, Context context) {
        this.e = e10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.P.size();
    }

    @Override
    public final int j(int i10) {
        v00 v00Var = (v00) this.e.P.get(i10);
        if (v00Var == null) {
            return 3;
        }
        return v00Var.f15754a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        e10 e10Var = this.e;
        ArrayList arrayList = e10Var.P;
        v00 v00Var = (v00) arrayList.get(i10);
        if (v00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((v00) arrayList.get(i14)).f15754a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f43008f;
            View view = c1Var.f43005a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(v00Var.d);
                                return;
                            case 7:
                                ((x00) view).e(v00Var.f38404m, z10);
                                return;
                            case 8:
                                l00 l00Var = (l00) view;
                                if (l00Var.f35213c != z10) {
                                    l00Var.f35213c = z10;
                                    l00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                s00 s00Var = (s00) view;
                                e10Var.I = s00Var;
                                s00Var.e(org.telegram.ui.Components.z5.cloneSpans(e10Var.f33095w, -1, s00Var.f37258s.getPaint().getFontMetricsInt(), 0.5f), false);
                                s00 s00Var2 = e10Var.I;
                                if (e10Var.getUserConfig().isPremium()) {
                                    i16 = e10Var.E;
                                }
                                s00Var2.d(i16, false);
                                e10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                tp0 tp0Var = (tp0) view;
                                tp0Var.setCloseAsLock(!e10Var.getUserConfig().isPremium());
                                if (e10Var.getUserConfig().isPremium()) {
                                    i16 = e10Var.E;
                                }
                                tp0Var.a(i16, false);
                                tp0Var.setOnColorClick(new et(3, this, tp0Var));
                                return;
                            case 11:
                                t00 t00Var = (t00) view;
                                e10Var.J = t00Var;
                                t00Var.setText(v00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = t00Var.f37611r;
                                u3Var.setText(v00Var.e);
                                u3Var.setOnClickListener(v00Var.f38397c);
                                return;
                            default:
                                return;
                        }
                    }
                    j00 j00Var = (j00) view;
                    boolean z12 = v00Var.f38403l;
                    ImageView imageView = j00Var.f34552a;
                    TextView textView = j00Var.f34553b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.i6.f19297q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.i6.f19259o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.i6.f19278p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.i6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    int i17 = v00Var.f38402k;
                    CharSequence charSequence = v00Var.d;
                    ImageView imageView2 = j00Var.f34552a;
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
                    Boolean bool = j00Var.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        j00Var.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (j00Var.f34554c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.sr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    j00Var.d = z10;
                    j00Var.setWillNotDraw(!z10);
                    j00Var.f34554c = i17;
                    return;
                }
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                String str = v00Var.f38400i;
                if (str != null) {
                    zaVar.d(str, v00Var.d, null, z10);
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
                        zaVar.d(user, null, string2, z10);
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
                    zaVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (v00Var.f38398f) {
                m4Var.setText(e10.x0(0, v00Var.d, false));
            } else {
                m4Var.setText(v00Var.d);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.za zaVar;
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
        e10 e10Var = this.e;
        switch (i10) {
            case 0:
                zaVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.za zaVar2 = new org.telegram.ui.Cells.za(context, 6, 0, false);
                zaVar2.setSelfAsSavedMessages(true);
                zaVar = zaVar2;
                break;
            case 2:
                org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) e10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                e6Var = ((org.telegram.ui.ActionBar.o2) e10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, cw0Var, string, false, 12, e6Var);
                e10Var.K = g3Var;
                g3Var.f20333n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f20330b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(e10Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(e10Var.f33095w);
                i11 = ((org.telegram.ui.ActionBar.o2) e10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, e10Var.f33096x);
                org.telegram.ui.Components.du editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new z00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                zaVar = g3Var;
                break;
            case 3:
                zaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f34552a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.y5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f34553b = textView;
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
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                zaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f38092a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.y5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                zaVar = frameLayout2;
                break;
            case 6:
            default:
                zaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.o2) e10Var).currentAccount;
                zaVar = new a10(this, this.d, e10Var, i14, e10Var.f33093r.f15826id);
                break;
            case 8:
                zaVar = new l00(context);
                break;
            case 9:
                zaVar = new s00(e10Var, context);
                break;
            case 10:
                Activity parentActivity = e10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.o2) e10Var).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.o2) e10Var).resourceProvider;
                zaVar = new tp0(2, i15, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.o2) e10Var).resourceProvider;
                zaVar = new t00(context, e6Var3);
                break;
        }
        return new s4.c1(zaVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 2 && i10 == 9) {
            e10 e10Var = this.e;
            ((s00) c1Var.f43005a).e(org.telegram.ui.Components.z5.cloneSpans(e10Var.f33095w, -1, e10Var.I.f37258s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f43008f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) c1Var.f43005a;
            g3Var.f20330b.k(true);
            g3Var.f20330b.d();
        }
    }
}
