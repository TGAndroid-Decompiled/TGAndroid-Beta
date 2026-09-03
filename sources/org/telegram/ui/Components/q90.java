package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class q90 extends k7.g0 {
    public int f28121a;
    public final TL_iv.PageBlock f28122b;
    public TL_iv.textConcat f28123c = new TL_iv.textConcat();

    public q90(TL_iv.PageBlock pageBlock) {
        this.f28122b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(ne.b bVar) {
        int i10 = this.f28121a;
        if (i10 >= 64) {
            return;
        }
        this.f28121a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f28121a--;
        }
    }

    @Override
    public final void b(ne.c cVar) {
        int i10 = this.f28121a;
        if (i10 >= 64) {
            return;
        }
        this.f28121a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f28121a--;
        }
    }

    @Override
    public final void c(ne.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = t90.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(ne.e eVar) {
        if (eVar instanceof ge.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof lc.d) {
            w(t90.c(((lc.d) eVar).f11966g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(ne.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(ne.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(ne.n nVar) {
        if (nVar instanceof lc.a) {
            if (!this.f28123c.texts.isEmpty()) {
                w(t90.j("\n"));
            }
            w(t90.c(((lc.a) nVar).f11962g));
            w(t90.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(ne.o oVar) {
        int i10 = this.f28121a;
        if (i10 >= 64) {
            return;
        }
        this.f28121a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f28121a--;
        }
    }

    @Override
    public final void m(ne.q qVar) {
        int i10 = this.f28121a;
        if (i10 >= 64) {
            return;
        }
        this.f28121a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f28121a--;
        }
    }

    @Override
    public final void n(ne.r rVar) {
        if (!this.f28123c.texts.isEmpty()) {
            w(t90.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(ne.s sVar) {
        w(t90.j(sVar.f14944g));
    }

    @Override
    public final void q(ne.d dVar) {
        w(t90.j(dVar.h));
    }

    @Override
    public final void r(ne.g gVar) {
        w(t90.j("\n"));
    }

    @Override
    public final void s(ne.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(ne.g gVar) {
        String str;
        if (this.f28122b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(t90.j(str));
    }

    @Override
    public final void u(ne.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f28123c.texts.add(richText);
    }

    public final TL_iv.RichText y(ne.p pVar) {
        TL_iv.textConcat textconcat = this.f28123c;
        this.f28123c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f28123c);
        this.f28123c = textconcat;
        return x10;
    }
}
