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
public final class k00 extends wf.b {
    public final Context d;
    public final n00 f39658e;

    public k00(n00 n00Var, Context context) {
        this.f39658e = n00Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 0 && i9 != 2 && i9 != 5 && i9 != 9 && i9 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39658e.L.size();
    }

    @Override
    public final int j(int i9) {
        e00 e00Var = (e00) this.f39658e.L.get(i9);
        if (e00Var == null) {
            return 3;
        }
        return e00Var.f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        String string;
        String string2;
        int i10;
        int i11;
        int i12;
        n00 n00Var = this.f39658e;
        ArrayList arrayList = n00Var.L;
        e00 e00Var = (e00) arrayList.get(i9);
        if (e00Var != null) {
            int i13 = i9 + 1;
            boolean z11 = false;
            if (i13 < arrayList.size() && (i12 = ((e00) arrayList.get(i13)).f48814a) != 3 && i12 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = q1Var.f5505f;
            View view = q1Var.f5501a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.b9) view).setText(e00Var.d);
                                return;
                            case 7:
                                ((g00) view).e(e00Var.f37775m, z10);
                                return;
                            case 8:
                                vz vzVar = (vz) view;
                                if (vzVar.f43614c != z10) {
                                    vzVar.f43614c = z10;
                                    vzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                b00 b00Var = (b00) view;
                                n00Var.E = b00Var;
                                b00Var.e(org.telegram.ui.Components.t5.cloneSpans(n00Var.f40572w, -1, b00Var.f36585s.getPaint().getFontMetricsInt(), 0.5f), false);
                                b00 b00Var2 = n00Var.E;
                                if (n00Var.getUserConfig().isPremium()) {
                                    i15 = n00Var.A;
                                }
                                b00Var2.d(i15, false);
                                n00Var.E.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                xo0 xo0Var = (xo0) view;
                                xo0Var.setCloseAsLock(!n00Var.getUserConfig().isPremium());
                                if (n00Var.getUserConfig().isPremium()) {
                                    i15 = n00Var.A;
                                }
                                xo0Var.a(i15, false);
                                xo0Var.setOnColorClick(new df(28, this, xo0Var));
                                return;
                            case 11:
                                c00 c00Var = (c00) view;
                                n00Var.F = c00Var;
                                c00Var.setText(e00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = c00Var.f37021r;
                                u3Var.setText(e00Var.f37768e);
                                u3Var.setOnClickListener(e00Var.f37767c);
                                return;
                            default:
                                return;
                        }
                    }
                    tz tzVar = (tz) view;
                    boolean z12 = e00Var.f37774l;
                    ImageView imageView = tzVar.f43087a;
                    TextView textView = tzVar.f43088b;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.f6.f23230q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.f6.o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.f6.f23212p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.f6.f23229q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    int i16 = e00Var.f37773k;
                    CharSequence charSequence = e00Var.d;
                    ImageView imageView2 = tzVar.f43087a;
                    if (!LocaleController.isRTL) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i16 == 0) {
                            f10 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i16 == 0) {
                            f10 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f10);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i16 != 0) {
                        z11 = true;
                    }
                    Boolean bool = tzVar.f43090e;
                    if (bool == null || bool.booleanValue() != z11) {
                        tzVar.f43090e = Boolean.valueOf(z11);
                        float f11 = 0.0f;
                        if (tzVar.f43089c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f11 = AndroidUtilities.dp(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        } else {
                            if (z11) {
                                f11 = AndroidUtilities.dp(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    tzVar.d = z10;
                    tzVar.setWillNotDraw(!z10);
                    tzVar.f43089c = i16;
                    return;
                }
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                String str = e00Var.f37771i;
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
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (e00Var.f37769f) {
                m4Var.setText(n00.w0(0, e00Var.d, false));
            } else {
                m4Var.setText(e00Var.d);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.va vaVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        Context context = this.d;
        n00 n00Var = this.f39658e;
        switch (i9) {
            case 0:
                vaVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar2 = new org.telegram.ui.Cells.va(context, 6, 0, false);
                vaVar2.setSelfAsSavedMessages(true);
                vaVar = vaVar2;
                break;
            case 2:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) n00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                b6Var = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, xu0Var, string, false, 12, b6Var);
                n00Var.G = g3Var;
                g3Var.f24377n = false;
                org.telegram.ui.Cells.d3 d3Var = g3Var.f24373b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(n00Var.getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(n00Var.f40572w);
                i10 = ((org.telegram.ui.ActionBar.o2) n00Var).currentAccount;
                org.telegram.ui.Components.k5.s(i10, n00Var.f40573x);
                org.telegram.ui.Components.mt editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new i00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                vaVar = g3Var;
                break;
            case 3:
                vaVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f43090e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f43087a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, g7.e6.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f43088b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                int i16 = 24;
                if (z10) {
                    i12 = 24;
                } else {
                    i12 = 0;
                }
                if (z10) {
                    i16 = 0;
                }
                textView.setPadding(i12, 0, i16, 0);
                if (LocaleController.isRTL) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    f10 = 0.0f;
                } else {
                    f10 = 72.0f;
                }
                if (z11) {
                    f11 = 72.0f;
                } else {
                    f11 = 0.0f;
                }
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                vaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f37369a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, g7.e6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                vaVar = frameLayout2;
                break;
            case 6:
            default:
                vaVar = new org.telegram.ui.Cells.b9(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.o2) n00Var).currentAccount;
                vaVar = new j00(this, this.d, n00Var, i13, n00Var.f40570r.f19649id);
                break;
            case 8:
                vaVar = new vz(context);
                break;
            case 9:
                vaVar = new b00(n00Var, context);
                break;
            case 10:
                Activity parentActivity = n00Var.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.o2) n00Var).currentAccount;
                b6Var2 = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
                vaVar = new xo0(2, i14, parentActivity, b6Var2);
                break;
            case 11:
                b6Var3 = ((org.telegram.ui.ActionBar.o2) n00Var).resourceProvider;
                vaVar = new c00(context, b6Var3);
                break;
        }
        return new f2.q1(vaVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 2 && i9 == 9) {
            n00 n00Var = this.f39658e;
            ((b00) q1Var.f5501a).e(org.telegram.ui.Components.t5.cloneSpans(n00Var.f40572w, -1, n00Var.E.f36585s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(f2.q1 q1Var) {
        if (q1Var.f5505f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) q1Var.f5501a;
            g3Var.f24373b.k(true);
            g3Var.f24373b.d();
        }
    }
}
