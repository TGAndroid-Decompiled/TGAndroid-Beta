package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class w80 extends f7.p8 {
    public int f34149a;
    public final TL_iv.PageBlock f34150b;
    public TL_iv.textConcat f34151c = new TL_iv.textConcat();

    public w80(TL_iv.PageBlock pageBlock) {
        this.f34150b = pageBlock;
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
    public final void a(ie.b bVar) {
        int i9 = this.f34149a;
        if (i9 >= 64) {
            return;
        }
        this.f34149a = i9 + 1;
        try {
            v(bVar);
        } finally {
            this.f34149a--;
        }
    }

    @Override
    public final void b(ie.c cVar) {
        int i9 = this.f34149a;
        if (i9 >= 64) {
            return;
        }
        this.f34149a = i9 + 1;
        try {
            v(cVar);
        } finally {
            this.f34149a--;
        }
    }

    @Override
    public final void c(ie.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = z80.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(ie.e eVar) {
        if (eVar instanceof be.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof hc.d) {
            w(z80.c(((hc.d) eVar).f10407g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(ie.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(ie.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(ie.n nVar) {
        if (nVar instanceof hc.a) {
            if (!this.f34151c.texts.isEmpty()) {
                w(z80.j("\n"));
            }
            w(z80.c(((hc.a) nVar).f10402g));
            w(z80.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(ie.o oVar) {
        int i9 = this.f34149a;
        if (i9 >= 64) {
            return;
        }
        this.f34149a = i9 + 1;
        try {
            v(oVar);
        } finally {
            this.f34149a--;
        }
    }

    @Override
    public final void m(ie.q qVar) {
        int i9 = this.f34149a;
        if (i9 >= 64) {
            return;
        }
        this.f34149a = i9 + 1;
        try {
            v(qVar);
        } finally {
            this.f34149a--;
        }
    }

    @Override
    public final void n(ie.r rVar) {
        if (!this.f34151c.texts.isEmpty()) {
            w(z80.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(ie.s sVar) {
        w(z80.j(sVar.f11127g));
    }

    @Override
    public final void q(ie.d dVar) {
        w(z80.j(dVar.h));
    }

    @Override
    public final void r(ie.g gVar) {
        w(z80.j("\n"));
    }

    @Override
    public final void s(ie.k kVar) {
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
    public final void t(ie.g gVar) {
        String str;
        if (this.f34150b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(z80.j(str));
    }

    @Override
    public final void u(ie.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f34151c.texts.add(richText);
    }

    public final TL_iv.RichText y(ie.p pVar) {
        TL_iv.textConcat textconcat = this.f34151c;
        this.f34151c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f34151c);
        this.f34151c = textconcat;
        return x10;
    }
}
