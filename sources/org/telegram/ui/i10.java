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
public final class i10 extends pg.b {
    public final Context d;
    public final l10 e;

    public i10(l10 l10Var, Context context) {
        this.e = l10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
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
        c10 c10Var = (c10) this.e.P.get(i10);
        if (c10Var == null) {
            return 3;
        }
        return c10Var.f43203a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        l10 l10Var = this.e;
        ArrayList arrayList = l10Var.P;
        c10 c10Var = (c10) arrayList.get(i10);
        if (c10Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((c10) arrayList.get(i14)).f43203a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = b1Var.f44841f;
            View view = b1Var.f44838a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(c10Var.d);
                                return;
                            case 7:
                                ((e10) view).e(c10Var.f34671m, z10);
                                return;
                            case 8:
                                s00 s00Var = (s00) view;
                                if (s00Var.f39910c != z10) {
                                    s00Var.f39910c = z10;
                                    s00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                z00 z00Var = (z00) view;
                                l10Var.I = z00Var;
                                z00Var.e(org.telegram.ui.Components.b6.cloneSpans(l10Var.f37811w, -1, z00Var.f42445s.getPaint().getFontMetricsInt(), 0.5f), false);
                                z00 z00Var2 = l10Var.I;
                                if (l10Var.getUserConfig().isPremium()) {
                                    i16 = l10Var.E;
                                }
                                z00Var2.d(i16, false);
                                l10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                dq0 dq0Var = (dq0) view;
                                dq0Var.setCloseAsLock(!l10Var.getUserConfig().isPremium());
                                if (l10Var.getUserConfig().isPremium()) {
                                    i16 = l10Var.E;
                                }
                                dq0Var.a(i16, false);
                                dq0Var.setOnColorClick(new mt(3, this, dq0Var));
                                return;
                            case 11:
                                a10 a10Var = (a10) view;
                                l10Var.J = a10Var;
                                a10Var.setText(c10Var.d);
                                org.telegram.ui.Cells.u3 u3Var = a10Var.f34012r;
                                u3Var.setText(c10Var.e);
                                u3Var.setOnClickListener(c10Var.f34664c);
                                return;
                            default:
                                return;
                        }
                    }
                    q00 q00Var = (q00) view;
                    boolean z12 = c10Var.f34670l;
                    ImageView imageView = q00Var.f39319a;
                    TextView textView = q00Var.f39320b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.g6.f20139q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f20104o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.g6.f20122p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.g6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                    int i17 = c10Var.f34669k;
                    CharSequence charSequence = c10Var.d;
                    ImageView imageView2 = q00Var.f39319a;
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
                    Boolean bool = q00Var.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        q00Var.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (q00Var.f39321c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.es.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    q00Var.d = z10;
                    q00Var.setWillNotDraw(!z10);
                    q00Var.f39321c = i17;
                    return;
                }
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                String str = c10Var.f34667i;
                if (str != null) {
                    xaVar.e(str, c10Var.d, null, z10);
                    return;
                }
                long j10 = c10Var.h;
                if (j10 > 0) {
                    TLRPC.User user = l10Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        xaVar.e(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = l10Var.getMessagesController().getChat(Long.valueOf(-j10));
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
                    xaVar.e(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (c10Var.f34665f) {
                m4Var.setText(l10.x0(0, c10Var.d, false));
            } else {
                m4Var.setText(c10Var.d);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.xa xaVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        Context context = this.d;
        l10 l10Var = this.e;
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
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) l10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                c6Var = ((org.telegram.ui.ActionBar.m2) l10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, ow0Var, string, false, 12, c6Var);
                l10Var.K = g3Var;
                g3Var.f21201n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f21198b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(l10Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(l10Var.f37811w);
                i11 = ((org.telegram.ui.ActionBar.m2) l10Var).currentAccount;
                org.telegram.ui.Components.s5.s(i11, l10Var.f37812x);
                org.telegram.ui.Components.nu editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new g10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                xaVar = g3Var;
                break;
            case 3:
                xaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f39319a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.a6.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
                TextView textView = new TextView(context);
                frameLayout.f39320b = textView;
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
                frameLayout.addView(textView, w7.a6.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
                xaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f34394a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 17));
                imageView2.setOnClickListener(new a(frameLayout2, 23));
                xaVar = frameLayout2;
                break;
            case 6:
            default:
                xaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.m2) l10Var).currentAccount;
                xaVar = new h10(this, this.d, l10Var, i14, l10Var.f37809r.f16708id);
                break;
            case 8:
                xaVar = new s00(context);
                break;
            case 9:
                xaVar = new z00(l10Var, context);
                break;
            case 10:
                Activity parentActivity = l10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.m2) l10Var).currentAccount;
                c6Var2 = ((org.telegram.ui.ActionBar.m2) l10Var).resourceProvider;
                xaVar = new dq0(2, i15, parentActivity, c6Var2);
                break;
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.m2) l10Var).resourceProvider;
                xaVar = new a10(context, c6Var3);
                break;
        }
        return new s4.b1(xaVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 2 && i10 == 9) {
            l10 l10Var = this.e;
            ((z00) b1Var.f44838a).e(org.telegram.ui.Components.b6.cloneSpans(l10Var.f37811w, -1, l10Var.I.f42445s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        if (b1Var.f44841f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) b1Var.f44838a;
            g3Var.f21198b.k(true);
            g3Var.f21198b.d();
        }
    }
}
