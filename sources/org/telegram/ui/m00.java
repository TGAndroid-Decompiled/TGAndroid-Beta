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
public final class m00 extends zf.b {
    public final Context d;
    public final p00 f40336e;

    public m00(p00 p00Var, Context context) {
        this.f40336e = p00Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40336e.L.size();
    }

    @Override
    public final int j(int i10) {
        g00 g00Var = (g00) this.f40336e.L.get(i10);
        if (g00Var == null) {
            return 3;
        }
        return g00Var.f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        p00 p00Var = this.f40336e;
        ArrayList arrayList = p00Var.L;
        g00 g00Var = (g00) arrayList.get(i10);
        if (g00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((g00) arrayList.get(i14)).f50845a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = n1Var.f6436f;
            View view = n1Var.f6432a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.y8) view).setText(g00Var.d);
                                return;
                            case 7:
                                ((i00) view).e(g00Var.f38409m, z10);
                                return;
                            case 8:
                                xz xzVar = (xz) view;
                                if (xzVar.f44679c != z10) {
                                    xzVar.f44679c = z10;
                                    xzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                d00 d00Var = (d00) view;
                                p00Var.E = d00Var;
                                d00Var.e(org.telegram.ui.Components.y5.cloneSpans(p00Var.f41268w, -1, d00Var.f37251s.getPaint().getFontMetricsInt(), 0.5f), false);
                                d00 d00Var2 = p00Var.E;
                                if (p00Var.getUserConfig().isPremium()) {
                                    i16 = p00Var.A;
                                }
                                d00Var2.d(i16, false);
                                p00Var.E.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                wo0 wo0Var = (wo0) view;
                                wo0Var.setCloseAsLock(!p00Var.getUserConfig().isPremium());
                                if (p00Var.getUserConfig().isPremium()) {
                                    i16 = p00Var.A;
                                }
                                wo0Var.a(i16, false);
                                wo0Var.setOnColorClick(new tm(21, this, wo0Var));
                                return;
                            case 11:
                                e00 e00Var = (e00) view;
                                p00Var.F = e00Var;
                                e00Var.setText(g00Var.d);
                                org.telegram.ui.Cells.r3 r3Var = e00Var.f37661r;
                                r3Var.setText(g00Var.f38402e);
                                r3Var.setOnClickListener(g00Var.f38401c);
                                return;
                            default:
                                return;
                        }
                    }
                    vz vzVar = (vz) view;
                    boolean z12 = g00Var.f38408l;
                    ImageView imageView = vzVar.f43798a;
                    TextView textView = vzVar.f43799b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.g6.f23295q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f23260o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.g6.f23279p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.g6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    int i17 = g00Var.f38407k;
                    CharSequence charSequence = g00Var.d;
                    ImageView imageView2 = vzVar.f43798a;
                    if (!LocaleController.isRTL) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f9 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f9 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f9);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f9 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f9);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i17 != 0) {
                        z11 = true;
                    }
                    Boolean bool = vzVar.f43801e;
                    if (bool == null || bool.booleanValue() != z11) {
                        vzVar.f43801e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (vzVar.f43800c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    vzVar.d = z10;
                    vzVar.setWillNotDraw(!z10);
                    vzVar.f43800c = i17;
                    return;
                }
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                String str = g00Var.f38405i;
                if (str != null) {
                    saVar.d(str, g00Var.d, null, z10);
                    return;
                }
                long j10 = g00Var.h;
                if (j10 > 0) {
                    TLRPC.User user = p00Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        saVar.d(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = p00Var.getMessagesController().getChat(Long.valueOf(-j10));
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
                    saVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (g00Var.f38403f) {
                k4Var.setText(p00.x0(0, g00Var.d, false));
            } else {
                k4Var.setText(g00Var.d);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.sa saVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        int i13;
        float f9;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        Context context = this.d;
        p00 p00Var = this.f40336e;
        switch (i10) {
            case 0:
                saVar = new org.telegram.ui.Cells.k4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.sa saVar2 = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                saVar2.setSelfAsSavedMessages(true);
                saVar = saVar2;
                break;
            case 2:
                org.telegram.ui.Components.hv0 hv0Var = (org.telegram.ui.Components.hv0) p00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                c6Var = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
                ?? d3Var = new org.telegram.ui.Cells.d3(this.d, hv0Var, string, false, 12, c6Var);
                p00Var.G = d3Var;
                d3Var.f24222n = false;
                org.telegram.ui.Cells.b3 b3Var = d3Var.f24218b;
                b3Var.getEditText().setEmojiColor(Integer.valueOf(p00Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                b3Var.setEmojiViewCacheType(25);
                b3Var.setText(p00Var.f41268w);
                i11 = ((org.telegram.ui.ActionBar.o2) p00Var).currentAccount;
                org.telegram.ui.Components.p5.s(i11, p00Var.f41269x);
                org.telegram.ui.Components.st editText = b3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.f3());
                editText.addTextChangedListener(new k00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                b3Var.getEditText().setImeOptions(268435462);
                saVar = d3Var;
                break;
            case 3:
                saVar = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f43801e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f43798a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, i7.f6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f43799b = textView;
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
                    f9 = 0.0f;
                } else {
                    f9 = 72.0f;
                }
                if (z11) {
                    f10 = 72.0f;
                } else {
                    f10 = 0.0f;
                }
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 23, f9, 0.0f, f10, 0.0f));
                saVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f37942a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, i7.f6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                saVar = frameLayout2;
                break;
            case 6:
            default:
                saVar = new org.telegram.ui.Cells.y8(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.o2) p00Var).currentAccount;
                saVar = new l00(this, this.d, p00Var, i14, p00Var.f41266r.f19620id);
                break;
            case 8:
                saVar = new xz(context);
                break;
            case 9:
                saVar = new d00(p00Var, context);
                break;
            case 10:
                Activity parentActivity = p00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.o2) p00Var).currentAccount;
                c6Var2 = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
                saVar = new wo0(2, i15, parentActivity, c6Var2);
                break;
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.o2) p00Var).resourceProvider;
                saVar = new e00(context, c6Var3);
                break;
        }
        return new f2.n1(saVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 2 && i10 == 9) {
            p00 p00Var = this.f40336e;
            ((d00) n1Var.f6432a).e(org.telegram.ui.Components.y5.cloneSpans(p00Var.f41268w, -1, p00Var.E.f37251s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(f2.n1 n1Var) {
        if (n1Var.f6436f == 2) {
            org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) n1Var.f6432a;
            d3Var.f24218b.k(true);
            d3Var.f24218b.d();
        }
    }
}
