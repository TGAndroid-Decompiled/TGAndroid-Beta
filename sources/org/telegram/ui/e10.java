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
public final class e10 extends og.b {
    public final Context d;
    public final h10 f36956e;

    public e10(h10 h10Var, Context context) {
        this.f36956e = h10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36956e.P.size();
    }

    @Override
    public final int j(int i10) {
        y00 y00Var = (y00) this.f36956e.P.get(i10);
        if (y00Var == null) {
            return 3;
        }
        return y00Var.f16876a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        h10 h10Var = this.f36956e;
        ArrayList arrayList = h10Var.P;
        y00 y00Var = (y00) arrayList.get(i10);
        if (y00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((y00) arrayList.get(i14)).f16876a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = d1Var.f47893f;
            View view = d1Var.f47889a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(y00Var.d);
                                return;
                            case 7:
                                ((a10) view).e(y00Var.f44228m, z10);
                                return;
                            case 8:
                                o00 o00Var = (o00) view;
                                if (o00Var.f40522c != z10) {
                                    o00Var.f40522c = z10;
                                    o00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                v00 v00Var = (v00) view;
                                h10Var.I = v00Var;
                                v00Var.e(org.telegram.ui.Components.b6.cloneSpans(h10Var.f38220w, -1, v00Var.f42630s.getPaint().getFontMetricsInt(), 0.5f), false);
                                v00 v00Var2 = h10Var.I;
                                if (h10Var.getUserConfig().isPremium()) {
                                    i16 = h10Var.E;
                                }
                                v00Var2.d(i16, false);
                                h10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                zp0 zp0Var = (zp0) view;
                                zp0Var.setCloseAsLock(!h10Var.getUserConfig().isPremium());
                                if (h10Var.getUserConfig().isPremium()) {
                                    i16 = h10Var.E;
                                }
                                zp0Var.a(i16, false);
                                zp0Var.setOnColorClick(new jt(3, this, zp0Var));
                                return;
                            case 11:
                                w00 w00Var = (w00) view;
                                h10Var.J = w00Var;
                                w00Var.setText(y00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = w00Var.f43018r;
                                u3Var.setText(y00Var.f44221e);
                                u3Var.setOnClickListener(y00Var.f44220c);
                                return;
                            default:
                                return;
                        }
                    }
                    m00 m00Var = (m00) view;
                    boolean z12 = y00Var.f44227l;
                    ImageView imageView = m00Var.f39875a;
                    TextView textView = m00Var.f39876b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.h6.f20799q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f20762o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.h6.f20780p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.h6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    int i17 = y00Var.f44226k;
                    CharSequence charSequence = y00Var.d;
                    ImageView imageView2 = m00Var.f39875a;
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
                    Boolean bool = m00Var.f39878e;
                    if (bool == null || bool.booleanValue() != z11) {
                        m00Var.f39878e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (m00Var.f39877c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.js.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    m00Var.d = z10;
                    m00Var.setWillNotDraw(!z10);
                    m00Var.f39877c = i17;
                    return;
                }
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                String str = y00Var.f44224i;
                if (str != null) {
                    xaVar.d(str, y00Var.d, null, z10);
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
                        xaVar.d(user, null, string2, z10);
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
                    xaVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (y00Var.f44222f) {
                m4Var.setText(h10.x0(0, y00Var.d, false));
            } else {
                m4Var.setText(y00Var.d);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
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
        h10 h10Var = this.f36956e;
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
                org.telegram.ui.Components.yw0 yw0Var = (org.telegram.ui.Components.yw0) h10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                c6Var = ((org.telegram.ui.ActionBar.m2) h10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, yw0Var, string, false, 12, c6Var);
                h10Var.K = g3Var;
                g3Var.f21890n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f21886b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(h10Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(h10Var.f38220w);
                i11 = ((org.telegram.ui.ActionBar.m2) h10Var).currentAccount;
                org.telegram.ui.Components.s5.s(i11, h10Var.f38221x);
                org.telegram.ui.Components.uu editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new c10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                xaVar = g3Var;
                break;
            case 3:
                xaVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f39878e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f39875a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.w5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
                TextView textView = new TextView(context);
                frameLayout.f39876b = textView;
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
                frameLayout.addView(textView, w7.w5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
                xaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f43705a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.w5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 17));
                imageView2.setOnClickListener(new a(frameLayout2, 23));
                xaVar = frameLayout2;
                break;
            case 6:
            default:
                xaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.m2) h10Var).currentAccount;
                xaVar = new d10(this, this.d, h10Var, i14, h10Var.f38218r.f17003id);
                break;
            case 8:
                xaVar = new o00(context);
                break;
            case 9:
                xaVar = new v00(h10Var, context);
                break;
            case 10:
                Activity parentActivity = h10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.m2) h10Var).currentAccount;
                c6Var2 = ((org.telegram.ui.ActionBar.m2) h10Var).resourceProvider;
                xaVar = new zp0(2, i15, parentActivity, c6Var2);
                break;
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.m2) h10Var).resourceProvider;
                xaVar = new w00(context, c6Var3);
                break;
        }
        return new s4.d1(xaVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 2 && i10 == 9) {
            h10 h10Var = this.f36956e;
            ((v00) d1Var.f47889a).e(org.telegram.ui.Components.b6.cloneSpans(h10Var.f38220w, -1, h10Var.I.f42630s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        if (d1Var.f47893f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) d1Var.f47889a;
            g3Var.f21886b.k(true);
            g3Var.f21886b.d();
        }
    }
}
