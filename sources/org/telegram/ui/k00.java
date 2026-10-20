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
public final class k00 extends pg.b {
    public final Context d;
    public final n00 e;

    public k00(n00 n00Var, Context context) {
        this.e = n00Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
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
        e00 e00Var = (e00) this.e.P.get(i10);
        if (e00Var == null) {
            return 3;
        }
        return e00Var.f44296a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        n00 n00Var = this.e;
        ArrayList arrayList = n00Var.P;
        e00 e00Var = (e00) arrayList.get(i10);
        if (e00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((e00) arrayList.get(i14)).f44296a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = b1Var.f45920f;
            View view = b1Var.f45917a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.d9) view).setText(e00Var.d);
                                return;
                            case 7:
                                ((g00) view).e(e00Var.f36479m, z10);
                                return;
                            case 8:
                                vz vzVar = (vz) view;
                                if (vzVar.f42417c != z10) {
                                    vzVar.f42417c = z10;
                                    vzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                b00 b00Var = (b00) view;
                                n00Var.I = b00Var;
                                b00Var.e(org.telegram.ui.Components.a6.cloneSpans(n00Var.f39382w, -1, b00Var.f35464s.getPaint().getFontMetricsInt(), 0.5f), false);
                                b00 b00Var2 = n00Var.I;
                                if (n00Var.getUserConfig().isPremium()) {
                                    i16 = n00Var.E;
                                }
                                b00Var2.d(i16, false);
                                n00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                fp0 fp0Var = (fp0) view;
                                fp0Var.setCloseAsLock(!n00Var.getUserConfig().isPremium());
                                if (n00Var.getUserConfig().isPremium()) {
                                    i16 = n00Var.E;
                                }
                                fp0Var.a(i16, false);
                                fp0Var.setOnColorClick(new org.telegram.ui.Components.qy(9, this, fp0Var));
                                return;
                            case 11:
                                c00 c00Var = (c00) view;
                                n00Var.J = c00Var;
                                c00Var.setText(e00Var.d);
                                org.telegram.ui.Cells.t3 t3Var = c00Var.f35764r;
                                t3Var.setText(e00Var.e);
                                t3Var.setOnClickListener(e00Var.f36472c);
                                return;
                            default:
                                return;
                        }
                    }
                    tz tzVar = (tz) view;
                    boolean z12 = e00Var.f36478l;
                    ImageView imageView = tzVar.f41771a;
                    TextView textView = tzVar.f41772b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.h6.f21228q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21193o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.h6.f21211p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.h6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    int i17 = e00Var.f36477k;
                    CharSequence charSequence = e00Var.d;
                    ImageView imageView2 = tzVar.f41771a;
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
                    Boolean bool = tzVar.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        tzVar.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (tzVar.f41773c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    tzVar.d = z10;
                    tzVar.setWillNotDraw(!z10);
                    tzVar.f41773c = i17;
                    return;
                }
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                String str = e00Var.f36475i;
                if (str != null) {
                    vaVar.e(str, e00Var.d, null, z10);
                    return;
                }
                long j10 = e00Var.h;
                if (j10 > 0) {
                    TLRPC.User user = n00Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        vaVar.e(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = n00Var.getMessagesController().getChat(Long.valueOf(-j10));
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
                    vaVar.e(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (e00Var.f36473f) {
                l4Var.setText(n00.x0(0, e00Var.d, false));
            } else {
                l4Var.setText(e00Var.d);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.va vaVar;
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
        n00 n00Var = this.e;
        switch (i10) {
            case 0:
                vaVar = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar2 = new org.telegram.ui.Cells.va(context, 6, 0, false);
                vaVar2.setSelfAsSavedMessages(true);
                vaVar = vaVar2;
                break;
            case 2:
                org.telegram.ui.Components.lw0 lw0Var = (org.telegram.ui.Components.lw0) n00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.n2) n00Var).resourceProvider;
                ?? f3Var = new org.telegram.ui.Cells.f3(this.d, lw0Var, string, false, 12, d6Var);
                n00Var.K = f3Var;
                f3Var.f22232n = false;
                org.telegram.ui.Cells.d3 d3Var = f3Var.f22229b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(n00Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(n00Var.f39382w);
                i11 = ((org.telegram.ui.ActionBar.n2) n00Var).currentAccount;
                org.telegram.ui.Components.r5.s(i11, n00Var.f39383x);
                org.telegram.ui.Components.iu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new i00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                vaVar = f3Var;
                break;
            case 3:
                vaVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f41771a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.z5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f41772b = textView;
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
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                vaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f36212a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                vaVar = frameLayout2;
                break;
            case 6:
            default:
                vaVar = new org.telegram.ui.Cells.d9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.n2) n00Var).currentAccount;
                vaVar = new j00(this, this.d, n00Var, i14, n00Var.f39380r.f17799id);
                break;
            case 8:
                vaVar = new vz(context);
                break;
            case 9:
                vaVar = new b00(n00Var, context);
                break;
            case 10:
                Activity parentActivity = n00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.n2) n00Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) n00Var).resourceProvider;
                vaVar = new fp0(2, i15, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.n2) n00Var).resourceProvider;
                vaVar = new c00(context, d6Var3);
                break;
        }
        return new s4.b1(vaVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
        if (i10 != 2 && i10 == 9) {
            n00 n00Var = this.e;
            ((b00) b1Var.f45917a).e(org.telegram.ui.Components.a6.cloneSpans(n00Var.f39382w, -1, n00Var.I.f35464s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        if (b1Var.f45920f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) b1Var.f45917a;
            f3Var.f22229b.k(true);
            f3Var.f22229b.d();
        }
    }
}
