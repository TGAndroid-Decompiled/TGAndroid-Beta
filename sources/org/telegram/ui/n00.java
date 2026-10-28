package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
public final class n00 extends qg.b {
    public final Context d;
    public final q00 e;

    public n00(q00 q00Var, Context context) {
        this.e = q00Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
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
        h00 h00Var = (h00) this.e.P.get(i10);
        if (h00Var == null) {
            return 3;
        }
        return h00Var.f47075a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        q00 q00Var = this.e;
        ArrayList arrayList = q00Var.P;
        h00 h00Var = (h00) arrayList.get(i10);
        if (h00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((h00) arrayList.get(i14)).f47075a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = e1Var.f47776f;
            View view = e1Var.f47773a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.i9) view).setText(h00Var.d);
                                return;
                            case 7:
                                ((j00) view).e(h00Var.f39744m, z10);
                                return;
                            case 8:
                                yz yzVar = (yz) view;
                                if (yzVar.f46107c != z10) {
                                    yzVar.f46107c = z10;
                                    yzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                e00 e00Var = (e00) view;
                                q00Var.I = e00Var;
                                e00Var.e(org.telegram.ui.Components.c6.cloneSpans(q00Var.f42562w, -1, e00Var.f38722s.getPaint().getFontMetricsInt(), 0.5f), false);
                                e00 e00Var2 = q00Var.I;
                                if (q00Var.getUserConfig().isPremium()) {
                                    i16 = q00Var.E;
                                }
                                e00Var2.d(i16, false);
                                q00Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                qp0 qp0Var = (qp0) view;
                                qp0Var.setCloseAsLock(!q00Var.getUserConfig().isPremium());
                                if (q00Var.getUserConfig().isPremium()) {
                                    i16 = q00Var.E;
                                }
                                qp0Var.a(i16, false);
                                qp0Var.setOnColorClick(new org.telegram.ui.Components.oy(11, this, qp0Var));
                                return;
                            case 11:
                                f00 f00Var = (f00) view;
                                q00Var.J = f00Var;
                                f00Var.setText(h00Var.d);
                                org.telegram.ui.Cells.y3 y3Var = f00Var.f39119r;
                                y3Var.setText(h00Var.e);
                                y3Var.setOnClickListener(h00Var.f39737c);
                                return;
                            default:
                                return;
                        }
                    }
                    wz wzVar = (wz) view;
                    boolean z12 = h00Var.f39743l;
                    ImageView imageView = wzVar.f45429a;
                    TextView textView = wzVar.f45430b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.y6.f23599q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.y6.f23561o6;
                    }
                    org.telegram.ui.ActionBar.f7.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.y6.f23582p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.y6.f23598q6;
                    }
                    org.telegram.ui.ActionBar.f7.V(textView, i12, null);
                    int i17 = h00Var.f39742k;
                    CharSequence charSequence = h00Var.d;
                    ImageView imageView2 = wzVar.f45429a;
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
                    Boolean bool = wzVar.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        wzVar.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (wzVar.f45431c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    wzVar.d = z10;
                    wzVar.setWillNotDraw(!z10);
                    wzVar.f45431c = i17;
                    return;
                }
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                String str = h00Var.f39740i;
                if (str != null) {
                    abVar.d(str, h00Var.d, null, z10);
                    return;
                }
                long j10 = h00Var.h;
                if (j10 > 0) {
                    TLRPC.User user = q00Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        abVar.d(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = q00Var.getMessagesController().getChat(Long.valueOf(-j10));
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
                    abVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (h00Var.f39738f) {
                q4Var.setText(q00.A0(0, h00Var.d, false));
            } else {
                q4Var.setText(h00Var.d);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ab abVar;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        Context context = this.d;
        q00 q00Var = this.e;
        switch (i10) {
            case 0:
                abVar = new org.telegram.ui.Cells.q4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.ab abVar2 = new org.telegram.ui.Cells.ab(context, 6, 0, false);
                abVar2.setSelfAsSavedMessages(true);
                abVar = abVar2;
                break;
            case 2:
                org.telegram.ui.Components.ww0 ww0Var = (org.telegram.ui.Components.ww0) q00Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                u6Var = ((org.telegram.ui.ActionBar.r2) q00Var).resourceProvider;
                ?? d3Var = new org.telegram.ui.Cells.d3(this.d, ww0Var, string, false, 12, u6Var);
                q00Var.K = d3Var;
                d3Var.f24007r = false;
                org.telegram.ui.Cells.b3 b3Var = d3Var.f24003b;
                b3Var.getEditText().setEmojiColor(Integer.valueOf(q00Var.getThemedColor(org.telegram.ui.ActionBar.y6.Oh)));
                b3Var.setEmojiViewCacheType(25);
                b3Var.setText(q00Var.f42562w);
                i11 = ((org.telegram.ui.ActionBar.r2) q00Var).currentAccount;
                org.telegram.ui.Components.t5.s(i11, q00Var.f42563x);
                org.telegram.ui.Components.ju editText = b3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.f3());
                editText.addTextChangedListener(new l00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                b3Var.getEditText().setImeOptions(268435462);
                abVar = d3Var;
                break;
            case 3:
                abVar = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f45429a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, org.telegram.ui.Components.kb1.h(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f45430b = textView;
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
                frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                abVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f39468a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, org.telegram.ui.Components.kb1.h(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                abVar = frameLayout2;
                break;
            case 6:
            default:
                abVar = new org.telegram.ui.Cells.i9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.r2) q00Var).currentAccount;
                abVar = new m00(this, this.d, q00Var, i14, q00Var.f42560r.f19548id);
                break;
            case 8:
                abVar = new yz(context);
                break;
            case 9:
                abVar = new e00(q00Var, context);
                break;
            case 10:
                Activity parentActivity = q00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.r2) q00Var).currentAccount;
                u6Var2 = ((org.telegram.ui.ActionBar.r2) q00Var).resourceProvider;
                abVar = new qp0(2, i15, parentActivity, u6Var2);
                break;
            case 11:
                u6Var3 = ((org.telegram.ui.ActionBar.r2) q00Var).resourceProvider;
                abVar = new f00(context, u6Var3);
                break;
        }
        return new s4.e1(abVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 2 && i10 == 9) {
            q00 q00Var = this.e;
            ((e00) e1Var.f47773a).e(org.telegram.ui.Components.c6.cloneSpans(q00Var.f42562w, -1, q00Var.I.f38722s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        if (e1Var.f47776f == 2) {
            org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) e1Var.f47773a;
            d3Var.f24003b.k(true);
            d3Var.f24003b.d();
        }
    }
}
