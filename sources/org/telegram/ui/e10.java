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
public final class e10 extends ng.b {
    public final Context d;
    public final h10 e;

    public e10(h10 h10Var, Context context) {
        this.e = h10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
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
        y00 y00Var = (y00) this.e.P.get(i10);
        if (y00Var == null) {
            return 3;
        }
        return y00Var.f14046a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        h10 h10Var = this.e;
        ArrayList arrayList = h10Var.P;
        y00 y00Var = (y00) arrayList.get(i10);
        if (y00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((y00) arrayList.get(i14)).f14046a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f41613f;
            View view = c1Var.f41610a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.f9) view).setText(y00Var.d);
                                return;
                            case 7:
                                ((a10) view).e(y00Var.f38864m, z10);
                                return;
                            case 8:
                                o00 o00Var = (o00) view;
                                if (o00Var.f35376c != z10) {
                                    o00Var.f35376c = z10;
                                    o00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                v00 v00Var = (v00) view;
                                h10Var.I = v00Var;
                                v00Var.e(org.telegram.ui.Components.y5.cloneSpans(h10Var.f33239w, -1, v00Var.f37371s.getPaint().getFontMetricsInt(), 0.5f), false);
                                v00 v00Var2 = h10Var.I;
                                if (h10Var.getUserConfig().isPremium()) {
                                    i16 = h10Var.E;
                                }
                                v00Var2.d(i16, false);
                                h10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                xp0 xp0Var = (xp0) view;
                                xp0Var.setCloseAsLock(!h10Var.getUserConfig().isPremium());
                                if (h10Var.getUserConfig().isPremium()) {
                                    i16 = h10Var.E;
                                }
                                xp0Var.a(i16, false);
                                xp0Var.setOnColorClick(new pf(26, this, xp0Var));
                                return;
                            case 11:
                                w00 w00Var = (w00) view;
                                h10Var.J = w00Var;
                                w00Var.setText(y00Var.d);
                                org.telegram.ui.Cells.t3 t3Var = w00Var.f37663r;
                                t3Var.setText(y00Var.e);
                                t3Var.setOnClickListener(y00Var.f38857c);
                                return;
                            default:
                                return;
                        }
                    }
                    m00 m00Var = (m00) view;
                    boolean z12 = y00Var.f38863l;
                    ImageView imageView = m00Var.f34813a;
                    TextView textView = m00Var.f34814b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.j6.f18162q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f18126o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.j6.f18144p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.j6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    int i17 = y00Var.f38862k;
                    CharSequence charSequence = y00Var.d;
                    ImageView imageView2 = m00Var.f34813a;
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
                    Boolean bool = m00Var.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        m00Var.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (m00Var.f34815c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    m00Var.d = z10;
                    m00Var.setWillNotDraw(!z10);
                    m00Var.f34815c = i17;
                    return;
                }
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
                String str = y00Var.f38860i;
                if (str != null) {
                    bbVar.d(str, y00Var.d, null, z10);
                    return;
                }
                long j3 = y00Var.h;
                if (j3 > 0) {
                    TLRPC.User user = h10Var.getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        bbVar.d(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = h10Var.getMessagesController().getChat(Long.valueOf(-j3));
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
                    bbVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (y00Var.f38858f) {
                m4Var.setText(h10.x0(0, y00Var.d, false));
            } else {
                m4Var.setText(y00Var.d);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.bb bbVar;
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
        h10 h10Var = this.e;
        switch (i10) {
            case 0:
                bbVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.bb bbVar2 = new org.telegram.ui.Cells.bb(context, 6, 0, false);
                bbVar2.setSelfAsSavedMessages(true);
                bbVar = bbVar2;
                break;
            case 2:
                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) h10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
                ?? f3Var = new org.telegram.ui.Cells.f3(this.d, aw0Var, string, false, 12, f6Var);
                h10Var.K = f3Var;
                f3Var.f19112n = false;
                org.telegram.ui.Cells.d3 d3Var = f3Var.f19109b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(h10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(h10Var.f33239w);
                i11 = ((org.telegram.ui.ActionBar.p2) h10Var).currentAccount;
                org.telegram.ui.Components.p5.s(i11, h10Var.f33240x);
                org.telegram.ui.Components.fu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new c10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                bbVar = f3Var;
                break;
            case 3:
                bbVar = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f34813a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.a6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f34814b = textView;
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
                frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                bbVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f38549a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.a6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                bbVar = frameLayout2;
                break;
            case 6:
            default:
                bbVar = new org.telegram.ui.Cells.f9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.p2) h10Var).currentAccount;
                bbVar = new d10(this, this.d, h10Var, i14, h10Var.f33237r.f14645id);
                break;
            case 8:
                bbVar = new o00(context);
                break;
            case 9:
                bbVar = new v00(h10Var, context);
                break;
            case 10:
                Activity parentActivity = h10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.p2) h10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
                bbVar = new xp0(2, i15, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.p2) h10Var).resourceProvider;
                bbVar = new w00(context, f6Var3);
                break;
        }
        return new s4.c1(bbVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 2 && i10 == 9) {
            h10 h10Var = this.e;
            ((v00) c1Var.f41610a).e(org.telegram.ui.Components.y5.cloneSpans(h10Var.f33239w, -1, h10Var.I.f37371s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f41613f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) c1Var.f41610a;
            f3Var.f19109b.k(true);
            f3Var.f19109b.d();
        }
    }
}
