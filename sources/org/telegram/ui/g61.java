package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class g61 extends org.telegram.ui.Components.dk0 {
    public final Context f47985c;
    public boolean d = true;
    public final ThemeActivity f47986e;

    public g61(ThemeActivity themeActivity, Context context) {
        this.f47986e = themeActivity;
        this.f47985c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f47986e.L0;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeActivity themeActivity = this.f47986e;
        if (i7 != themeActivity.f43878b0 && i7 != themeActivity.L && i7 != themeActivity.f43880c0 && i7 != themeActivity.Z && i7 != themeActivity.Q && i7 != themeActivity.R && i7 != themeActivity.N && i7 != themeActivity.M) {
            if (i7 != themeActivity.f43886g0 && i7 != themeActivity.f43876a0 && i7 != themeActivity.f43905w0 && i7 != themeActivity.C0 && i7 != themeActivity.I0) {
                if (i7 != themeActivity.f43900s0 && i7 != themeActivity.W && i7 != themeActivity.f43881d0 && i7 != themeActivity.P && i7 != themeActivity.f43888i0 && i7 != themeActivity.f43894o0 && i7 != themeActivity.f43891l0 && i7 != themeActivity.K && i7 != themeActivity.K0 && i7 != themeActivity.A0 && i7 != themeActivity.D0 && i7 != themeActivity.E0 && i7 != themeActivity.F0) {
                    if (i7 != themeActivity.S && i7 != themeActivity.T && i7 != themeActivity.U && i7 != themeActivity.V) {
                        if (i7 != themeActivity.X && i7 != themeActivity.f43883e0 && i7 != themeActivity.f43887h0 && i7 != themeActivity.f43908y && i7 != themeActivity.f43889j0 && i7 != themeActivity.f43906x && i7 != themeActivity.m0 && i7 != themeActivity.f43890k0 && i7 != themeActivity.f43902u0 && i7 != themeActivity.f43907x0 && i7 != themeActivity.J0 && i7 != themeActivity.G0 && i7 != themeActivity.H0) {
                            if (i7 == themeActivity.f43885f0) {
                                return 6;
                            }
                            if (i7 != themeActivity.Y && i7 != themeActivity.H && i7 != themeActivity.F) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i7 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i11 && i7 != themeActivity.E && i7 != themeActivity.f43901t0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i7 != i12 && i7 != themeActivity.G) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i7 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i7 == i14) {
                                                    return 8;
                                                }
                                                if (i7 != themeActivity.f43893n0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i7 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i7 != i16) {
                                                            if (i7 == themeActivity.f43895p0) {
                                                                return 11;
                                                            }
                                                            if (i7 != themeActivity.f43898r0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i7 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i7 != i18 && i7 != themeActivity.f43910z0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i7 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i7 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i7 != i21 && i7 != themeActivity.B0) {
                                                                                    if (i7 == themeActivity.f43903v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43909y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43896q0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i7 != themeActivity.I && i7 != themeActivity.J) {
                                                                                        i22 = themeActivity.appIconSelectorRow;
                                                                                        if (i7 != i22) {
                                                                                            i23 = themeActivity.changeUserColor;
                                                                                            if (i7 == i23) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        String N0;
        String N02;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String N03;
        String N04;
        int i23 = f1Var.f59169f;
        View view = f1Var.f59165a;
        ThemeActivity themeActivity = this.f47986e;
        boolean z11 = false;
        boolean z12 = true;
        if (i23 != 1) {
            if (i23 != 2) {
                if (i23 != 4) {
                    if (i23 != 5) {
                        if (i23 != 6) {
                            if (i23 != 7) {
                                if (i23 != 14) {
                                    if (i23 != 17) {
                                        if (i23 != 19) {
                                            if (i23 != 21) {
                                                switch (i23) {
                                                    case 10:
                                                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i7 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i7 == i22) {
                                                                j5Var.b(org.telegram.messenger.hd.N0(2131749016, null), org.telegram.messenger.hd.N0(2131749015, null), 2131232031, themeActivity.getMessagesController().S2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.m6.f29575o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            N03 = org.telegram.ui.ActionBar.m6.C0();
                                                        } else {
                                                            N03 = org.telegram.messenger.hd.N0(2131753780, "AutoNightThemeOff");
                                                        }
                                                        if (z11) {
                                                            int i24 = org.telegram.ui.ActionBar.m6.f29575o;
                                                            if (i24 == 1) {
                                                                N04 = org.telegram.messenger.hd.N0(2131753784, "AutoNightScheduled");
                                                            } else if (i24 == 3) {
                                                                N04 = org.telegram.messenger.hd.N0(2131753783, "AutoNightSystemDefault");
                                                            } else {
                                                                N04 = org.telegram.messenger.hd.N0(2131753793, "AutoNightAdaptive");
                                                            }
                                                            N03 = a8.p0.E(N04, " ", N03);
                                                        }
                                                        j5Var.b(org.telegram.messenger.hd.N0(2131753781, "AutoNightTheme"), N03, 2131231844, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f43879c.A1(themeActivity.f43877b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) view;
                                                        i61 i61Var = (i61) ek0Var.getAdapter();
                                                        i61Var.f();
                                                        int indexOf = i61Var.f48589e.indexOf(i61Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = i61Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((v4.c0) ek0Var.getLayoutManager()).h1(indexOf, (themeActivity.f43877b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((rl0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                                        if (i7 == themeActivity.I) {
                                            i6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            i6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((xt) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                                n8Var.f31173w = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i7 == i16) {
                                    n8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.m6.f29621q6;
                                    n8Var.g(i25, i25);
                                    String N05 = org.telegram.messenger.hd.N0(2131752538, null);
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z11 = true;
                                    }
                                    n8Var.o(2131232068, N05, z11);
                                    return;
                                } else if (i7 != themeActivity.f43910z0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i7 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i7 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i7 == i19) {
                                                n8Var.g(org.telegram.ui.ActionBar.m6.J5, org.telegram.ui.ActionBar.m6.G6);
                                                n8Var.o(2131232040, org.telegram.messenger.hd.N0(2131744614, null), true);
                                                n8Var.setSubtitle(org.telegram.messenger.hd.N0(2131744613, null));
                                                n8Var.f31172s = 64;
                                                n8Var.f31173w = 60;
                                                n8Var.f31174x = 20;
                                                return;
                                            } else if (i7 == themeActivity.B0) {
                                                n8Var.g(org.telegram.ui.ActionBar.m6.J5, org.telegram.ui.ActionBar.m6.G6);
                                                n8Var.o(2131232039, org.telegram.messenger.hd.N0(2131745033, null), false);
                                                n8Var.setSubtitle(org.telegram.messenger.hd.N0(2131745034, null));
                                                n8Var.f31172s = 64;
                                                n8Var.f31173w = 60;
                                                n8Var.f31174x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        n8Var.g(org.telegram.ui.ActionBar.m6.J5, org.telegram.ui.ActionBar.m6.G6);
                                        n8Var.o(2131232016, org.telegram.messenger.hd.N0(2131748673, null), true);
                                        n8Var.setSubtitle(org.telegram.messenger.hd.N0(2131748672, null));
                                        n8Var.f31173w = 60;
                                        n8Var.f31172s = 64;
                                        n8Var.f31174x = 20;
                                        return;
                                    }
                                    n8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.m6.f29621q6;
                                    n8Var.g(i26, i26);
                                    n8Var.o(2131232099, org.telegram.messenger.hd.N0(2131751700, null), false);
                                    return;
                                } else {
                                    n8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.m6.f29621q6;
                                    n8Var.g(i27, i27);
                                    n8Var.o(2131232402, org.telegram.messenger.hd.N0(2131751269, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            if (i7 == themeActivity.Y) {
                                s8Var.f(org.telegram.messenger.hd.N0(2131753788, "AutoNightLocation"), org.telegram.ui.ActionBar.m6.f29594p, true);
                                return;
                            } else if (i7 == themeActivity.O) {
                                s8Var.f(org.telegram.messenger.hd.N0(2131751145, "EnableAnimations"), org.telegram.messenger.np.g1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i7 == themeActivity.H) {
                                s8Var.f(org.telegram.messenger.hd.N0(2131745436, "SendByEnter"), org.telegram.messenger.np.g1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i7 != themeActivity.F) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i7 == i12) {
                                    s8Var.g(org.telegram.messenger.hd.N0(2131746231, "RaiseToListen"), org.telegram.messenger.hd.N0(2131746230, "RaiseToListenInfo"), org.telegram.messenger.cz.f23440s0, true, true);
                                    return;
                                } else if (i7 != themeActivity.G) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i7 == i14) {
                                            s8Var.f(org.telegram.messenger.hd.N0(2131747238, null), org.telegram.messenger.cz.G0, true);
                                            return;
                                        } else if (i7 != themeActivity.E) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i7 == i15) {
                                                s8Var.g(org.telegram.messenger.hd.N0(2131745134, null), org.telegram.messenger.hd.N0(2131745133, null), themeActivity.getMessagesController().e5(), true, true);
                                                return;
                                            } else if (i7 == themeActivity.f43901t0) {
                                                s8Var.f(org.telegram.messenger.hd.N0(2131753672, "BlurInChat"), org.telegram.messenger.cz.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            s8Var.g(org.telegram.messenger.hd.N0(2131751426, "DirectShare"), org.telegram.messenger.hd.N0(2131751425, "DirectShareInfo"), org.telegram.messenger.cz.f23454x0, false, true);
                                            return;
                                        }
                                    }
                                    s8Var.g(org.telegram.messenger.hd.N0(2131747237, null), org.telegram.messenger.hd.N0(2131747236, "PauseMusicOnRecordInfo"), org.telegram.messenger.cz.F0, true, true);
                                    return;
                                } else {
                                    s8Var.g(org.telegram.messenger.hd.N0(2131748056, "NextMediaTap"), org.telegram.messenger.hd.N0(2131748055, "NextMediaTapInfo"), org.telegram.messenger.cz.f23443t0, true, true);
                                    return;
                                }
                            } else {
                                s8Var.g(org.telegram.messenger.hd.N0(2131746229, "RaiseToSpeak"), org.telegram.messenger.hd.N0(2131746228, "RaiseToSpeakInfo"), org.telegram.messenger.cz.f23437r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j0) view).setProgress(org.telegram.ui.ActionBar.m6.f29614q);
                        return;
                    }
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (i7 == themeActivity.X) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131753785, "AutoNightSchedule"));
                        return;
                    } else if (i7 == themeActivity.f43883e0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131753792, "AutoNightBrightness"));
                        return;
                    } else if (i7 == themeActivity.f43887h0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131753786, "AutoNightPreferred"));
                        return;
                    } else if (i7 == themeActivity.f43908y) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131745787, "SETTINGS"));
                        return;
                    } else if (i7 == themeActivity.f43889j0) {
                        if (themeActivity.f43884f == 3) {
                            o4Var.setText(org.telegram.messenger.hd.N0(2131752827, "BuildMyOwnTheme"));
                            return;
                        } else {
                            o4Var.setText(org.telegram.messenger.hd.N0(2131751999, "ColorTheme"));
                            return;
                        }
                    } else if (i7 == themeActivity.f43906x) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131743948, "TextSizeHeader"));
                        return;
                    } else if (i7 == themeActivity.m0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131752213, "ChatList"));
                        return;
                    } else if (i7 == themeActivity.f43890k0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131752828, "BubbleRadius"));
                        return;
                    } else if (i7 == themeActivity.f43902u0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131752210, "ChatListSwipeGesture"));
                        return;
                    } else if (i7 == themeActivity.f43907x0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131745455, "SelectTheme"));
                        return;
                    } else if (i7 == themeActivity.J0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131754237, null));
                        return;
                    } else if (i7 == themeActivity.H0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131747571, "OtherSettings"));
                        return;
                    } else if (i7 == themeActivity.G0) {
                        o4Var.setText(org.telegram.messenger.hd.N0(2131748467, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i7 == themeActivity.S) {
                    String N06 = org.telegram.messenger.hd.N0(2131753790, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.m6.f29575o == 0) {
                        z11 = true;
                    }
                    caVar.a(N06, z11, true);
                    return;
                } else if (i7 == themeActivity.T) {
                    String N07 = org.telegram.messenger.hd.N0(2131753784, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.m6.f29575o == 1) {
                        z11 = true;
                    }
                    caVar.a(N07, z11, true);
                    return;
                } else if (i7 == themeActivity.U) {
                    String N08 = org.telegram.messenger.hd.N0(2131753793, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.m6.f29575o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.V != -1) {
                        z11 = true;
                    }
                    caVar.a(N08, z10, z11);
                    return;
                } else if (i7 == themeActivity.V) {
                    String N09 = org.telegram.messenger.hd.N0(2131753783, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.m6.f29575o != 3) {
                        z12 = false;
                    }
                    caVar.a(N09, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            if (i7 == themeActivity.f43886g0) {
                a9Var.setText(org.telegram.messenger.hd.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (org.telegram.ui.ActionBar.m6.f29614q * 100.0f))));
                return;
            } else if (i7 == themeActivity.f43876a0) {
                a9Var.setText(ThemeActivity.D0());
                return;
            } else if (i7 == themeActivity.f43905w0) {
                a9Var.setText(org.telegram.messenger.hd.N0(2131752209, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.I0) {
                a9Var.setText(org.telegram.messenger.hd.N0(2131748672, "LiteModeInfo"));
                return;
            } else {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        i10 = themeActivity.nightThemeRow;
        if (i7 == i10) {
            if (org.telegram.ui.ActionBar.m6.f29575o != 0 && org.telegram.ui.ActionBar.m6.J != null) {
                x9Var.c(org.telegram.messenger.hd.N0(2131753781, null), org.telegram.ui.ActionBar.m6.C0(), false, false);
            } else {
                x9Var.c(org.telegram.messenger.hd.N0(2131753781, null), org.telegram.messenger.hd.N0(2131753780, null), false, false);
            }
        } else if (i7 == themeActivity.f43878b0) {
            int i28 = org.telegram.ui.ActionBar.m6.f29633r;
            int i29 = i28 / 60;
            x9Var.c(org.telegram.messenger.hd.N0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i29), Integer.valueOf(i28 - (i29 * 60))), false, true);
        } else if (i7 == themeActivity.f43880c0) {
            int i30 = org.telegram.ui.ActionBar.m6.f29653s;
            int i31 = i30 / 60;
            x9Var.c(org.telegram.messenger.hd.N0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, false);
        } else if (i7 == themeActivity.Z) {
            x9Var.c(org.telegram.messenger.hd.N0(2131753778, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.m6.f29728w, false, false);
        } else if (i7 == themeActivity.R) {
            int i32 = org.telegram.messenger.np.g1().getInt("sortContactsBy", 0);
            if (i32 == 0) {
                N02 = org.telegram.messenger.hd.N0(2131751588, "Default");
            } else if (i32 == 1) {
                N02 = org.telegram.messenger.hd.N0(2131745091, "FirstName");
            } else {
                N02 = org.telegram.messenger.hd.N0(2131745090, "LastName");
            }
            x9Var.c(org.telegram.messenger.hd.N0(2131745095, "SortBy"), N02, false, true);
        } else if (i7 == themeActivity.Q) {
            x9Var.b(org.telegram.messenger.hd.N0(2131749071, "ImportContacts"), true);
        } else if (i7 == themeActivity.L) {
            int i33 = org.telegram.messenger.cz.f23441s1;
            if (i33 == 0) {
                N0 = org.telegram.messenger.hd.N0(2131751354, "DistanceUnitsAutomatic");
            } else if (i33 == 1) {
                N0 = org.telegram.messenger.hd.N0(2131751353, "DistanceUnitsKilometers");
            } else {
                N0 = org.telegram.messenger.hd.N0(2131751352, "DistanceUnitsMiles");
            }
            String N010 = org.telegram.messenger.hd.N0(2131751355, "DistanceUnits");
            boolean z13 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z12 = false;
            }
            x9Var.c(N010, N0, z13, z12);
            themeActivity.Q0 = false;
        } else if (i7 == themeActivity.M) {
            x9Var.c(org.telegram.messenger.hd.N0(2131745603, null), org.telegram.ui.web.e1.a().f53126a, themeActivity.R0, false);
        } else if (i7 == themeActivity.N) {
            String N011 = org.telegram.messenger.hd.N0(2131748246, null);
            if (org.telegram.messenger.cz.f23446u0) {
                i11 = 2131748244;
            } else {
                i11 = 2131748245;
            }
            x9Var.c(N011, org.telegram.messenger.hd.N0(i11, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? frameLayout;
        int i10;
        int i11;
        float f10;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        f61 j5Var;
        int i14;
        org.telegram.ui.ActionBar.r4 r4Var;
        int i15;
        int i16;
        int i17 = 3;
        float f11 = 21.0f;
        ThemeActivity themeActivity = this.f47986e;
        Context context = this.f47985c;
        switch (i7) {
            case 1:
                j5Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f30522a = textView;
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                org.telegram.messenger.o10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.hd.f24444a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z12 = org.telegram.messenger.hd.f24444a0;
                if (z12) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i18 = i11 | 48;
                if (z12) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (!z12) {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, c8.ma.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f30523b = imageView;
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232757);
                if (!org.telegram.messenger.hd.f24444a0) {
                    i17 = 5;
                }
                frameLayout.addView(imageView, c8.ma.d(19, 14.0f, i17 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = frameLayout;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 6:
                j5Var = new c61(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                j5Var = new h61(themeActivity, context);
                break;
            case 9:
                frameLayout = new d61(context, 0);
                frameLayout.f46888b = new org.telegram.ui.Cells.x0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i19 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) frameLayout.f46888b;
                    if (i19 >= x0VarArr.length) {
                        j5Var = frameLayout;
                        break;
                    } else {
                        if (i19 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context, 0);
                        x0Var.f32312b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.f32314e = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.f32313c = z10;
                        if (z10) {
                            i12 = 2131752211;
                        } else {
                            i12 = 2131752212;
                        }
                        x0Var.setContentDescription(org.telegram.messenger.hd.N0(i12, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.d = w0Var;
                        w0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        x0Var.addView(w0Var, c8.ma.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && org.telegram.messenger.cz.f23432p1) || (!z10 && !org.telegram.messenger.cz.f23432p1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w0Var.a(z11, false);
                        x0VarArr[i19] = x0Var;
                        org.telegram.ui.Cells.x0 x0Var2 = ((org.telegram.ui.Cells.x0[]) frameLayout.f46888b)[i19];
                        if (i19 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        frameLayout.addView(x0Var2, c8.ma.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) frameLayout.f46888b)[i19].setOnClickListener(new fi.v1(3, frameLayout, z10));
                        i19++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(this.f47985c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                e61 e61Var = new e61(this, this.f47985c, themeActivity, themeActivity.f43884f, themeActivity.f43882e, themeActivity.d);
                themeActivity.f43879c = e61Var;
                e61Var.setDrawDivider(themeActivity.f43904w);
                themeActivity.f43879c.setFocusable(false);
                View view = themeActivity.f43879c;
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(148.0f)));
                j5Var = view;
                break;
            case 12:
                f61 f61Var = new f61(0, context, null);
                f61Var.setFocusable(false);
                f61Var.setItemAnimator(null);
                f61Var.setLayoutAnimation(null);
                f61Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                f61Var.setClipToPadding(false);
                v4.c0 c0Var = new v4.c0();
                c0Var.j1(0);
                f61Var.setLayoutManager(c0Var);
                i61 i61Var = new i61(themeActivity, context);
                f61Var.setAdapter(i61Var);
                f61Var.setOnItemClickListener(new a61(this, i61Var, f61Var, 0));
                f61Var.setOnItemLongClickListener(new aj0(20, this, i61Var));
                f61Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(62.0f)));
                j5Var = f61Var;
                break;
            case 13:
                j5Var = new x51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.n8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.g2) themeActivity).currentAccount;
                j5Var = new org.telegram.ui.Components.gx0(context, i14);
                break;
            case 16:
                r4Var = ((org.telegram.ui.ActionBar.g2) themeActivity).parentLayout;
                View am0Var = new am0(context, r4Var, 0);
                am0Var.setImportantForAccessibility(4);
                j5Var = am0Var;
                break;
            case 17:
                View xtVar = new xt(themeActivity.f43884f, context, themeActivity);
                xtVar.setFocusable(false);
                xtVar.setLayoutParams(new v4.q0(-1, -2));
                j5Var = xtVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.g2) themeActivity).currentAccount;
                ?? ek0Var = new org.telegram.ui.Components.ek0(context, null);
                ek0Var.f31825f3 = new ArrayList();
                ek0Var.f31827h3 = i15;
                ek0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                ek0Var.setFocusable(false);
                ek0Var.setItemAnimator(null);
                ek0Var.setLayoutAnimation(null);
                v4.c0 c0Var2 = new v4.c0(0, false);
                ek0Var.f31826g3 = c0Var2;
                ek0Var.setLayoutManager(c0Var2);
                ek0Var.setAdapter(new y7(ek0Var, 1));
                ek0Var.i(new ai.j0(ek0Var, 2));
                ek0Var.setOnItemClickListener(new bi.t1(ek0Var, themeActivity, context, 4));
                ek0Var.z1();
                j5Var = ek0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.g2) themeActivity).currentAccount;
                frameLayout = new rl0(i16, 0L, this.f47985c, themeActivity.getResourceProvider());
                j5Var = frameLayout;
                break;
        }
        return new v4.f1(j5Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        if (f1Var.f59169f == 4) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) f1Var.f59165a;
            if (f1Var.b() == org.telegram.ui.ActionBar.m6.f29575o) {
                z10 = true;
            } else {
                z10 = false;
            }
            caVar.setTypeChecked(z10);
        }
    }
}
