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
public final class m00 extends pg.b {
    public final Context d;
    public final p00 e;

    public m00(p00 p00Var, Context context) {
        this.e = p00Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
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
        g00 g00Var = (g00) this.e.P.get(i10);
        if (g00Var == null) {
            return 3;
        }
        return g00Var.f44291a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        p00 p00Var = this.e;
        ArrayList arrayList = p00Var.P;
        g00 g00Var = (g00) arrayList.get(i10);
        if (g00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((g00) arrayList.get(i14)).f44291a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = b1Var.f45913f;
            View view = b1Var.f45910a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.d9) view).setText(g00Var.d);
                                return;
                            case 7:
                                ((i00) view).e(g00Var.f37008m, z10);
                                return;
                            case 8:
                                xz xzVar = (xz) view;
                                if (xzVar.f43281c != z10) {
                                    xzVar.f43281c = z10;
                                    xzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                d00 d00Var = (d00) view;
                                p00Var.I = d00Var;
                                d00Var.e(org.telegram.ui.Components.a6.cloneSpans(p00Var.f39907w, -1, d00Var.f36013s.getPaint().getFontMetricsInt(), 0.5f), false);
                                d00 d00Var2 = p00Var.I;
                                if (p00Var.getUserConfig().isPremium()) {
                                    i16 = p00Var.E;
                                }
                                d00Var2.d(i16, false);
                                p00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                hp0 hp0Var = (hp0) view;
                                hp0Var.setCloseAsLock(!p00Var.getUserConfig().isPremium());
                                if (p00Var.getUserConfig().isPremium()) {
                                    i16 = p00Var.E;
                                }
                                hp0Var.a(i16, false);
                                hp0Var.setOnColorClick(new org.telegram.ui.Components.qy(9, this, hp0Var));
                                return;
                            case 11:
                                e00 e00Var = (e00) view;
                                p00Var.J = e00Var;
                                e00Var.setText(g00Var.d);
                                org.telegram.ui.Cells.t3 t3Var = e00Var.f36319r;
                                t3Var.setText(g00Var.e);
                                t3Var.setOnClickListener(g00Var.f37001c);
                                return;
                            default:
                                return;
                        }
                    }
                    vz vzVar = (vz) view;
                    boolean z12 = g00Var.f37007l;
                    ImageView imageView = vzVar.f42294a;
                    TextView textView = vzVar.f42295b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.h6.f21224q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21189o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.h6.f21207p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.h6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    int i17 = g00Var.f37006k;
                    CharSequence charSequence = g00Var.d;
                    ImageView imageView2 = vzVar.f42294a;
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
                    Boolean bool = vzVar.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        vzVar.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (vzVar.f42296c == i17) {
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
                    vzVar.d = z10;
                    vzVar.setWillNotDraw(!z10);
                    vzVar.f42296c = i17;
                    return;
                }
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                String str = g00Var.f37004i;
                if (str != null) {
                    vaVar.e(str, g00Var.d, null, z10);
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
                        vaVar.e(user, null, string2, z10);
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
                    vaVar.e(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (g00Var.f37002f) {
                l4Var.setText(p00.x0(0, g00Var.d, false));
            } else {
                l4Var.setText(g00Var.d);
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
        p00 p00Var = this.e;
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
                org.telegram.ui.Components.jw0 jw0Var = (org.telegram.ui.Components.jw0) p00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
                ?? f3Var = new org.telegram.ui.Cells.f3(this.d, jw0Var, string, false, 12, d6Var);
                p00Var.K = f3Var;
                f3Var.f22228n = false;
                org.telegram.ui.Cells.d3 d3Var = f3Var.f22225b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(p00Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(p00Var.f39907w);
                i11 = ((org.telegram.ui.ActionBar.n2) p00Var).currentAccount;
                org.telegram.ui.Components.r5.s(i11, p00Var.f39908x);
                org.telegram.ui.Components.iu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new k00(this));
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
                frameLayout.f42294a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.z5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f42295b = textView;
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
                frameLayout2.f36757a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 23));
                vaVar = frameLayout2;
                break;
            case 6:
            default:
                vaVar = new org.telegram.ui.Cells.d9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.n2) p00Var).currentAccount;
                vaVar = new l00(this, this.d, p00Var, i14, p00Var.f39905r.f17798id);
                break;
            case 8:
                vaVar = new xz(context);
                break;
            case 9:
                vaVar = new d00(p00Var, context);
                break;
            case 10:
                Activity parentActivity = p00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.n2) p00Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
                vaVar = new hp0(2, i15, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.n2) p00Var).resourceProvider;
                vaVar = new e00(context, d6Var3);
                break;
        }
        return new s4.b1(vaVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 != 2 && i10 == 9) {
            p00 p00Var = this.e;
            ((d00) b1Var.f45910a).e(org.telegram.ui.Components.a6.cloneSpans(p00Var.f39907w, -1, p00Var.I.f36013s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        if (b1Var.f45913f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) b1Var.f45910a;
            f3Var.f22225b.k(true);
            f3Var.f22225b.d();
        }
    }
}
